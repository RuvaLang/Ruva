package me.hydos.ruva;

import me.hydos.ruva.antlr.RuvaParser;
import me.hydos.ruva.expressions.Expression;
import me.hydos.ruva.statements.Statement;
import me.hydos.ruva.statements.VariableDeclaration;
import me.hydos.ruva.visitor.Visibility;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AntlrBaseVisitor extends AbstractParseTreeVisitor<Object> {

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        if (node instanceof RuvaParser.FieldDeclarationContext ctx) {
            visitFieldDeclaration(ctx);
        }

        if (node instanceof RuvaParser.MethodDeclarationContext ctx) {
            visitMethodDeclaration(ctx);
        }

        return super.visitChildren(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        throw new RuntimeException("Parsing Error! " + node.getText());
    }

    protected List<Statement> getStatements(RuvaParser.BlockContext ctx) {
        ArrayList<Statement> statements = new ArrayList<>();

        List<RuvaParser.BlockStatementContext> rawStatements = ctx.blockStatement();
        if (rawStatements != null) {
            for (RuvaParser.BlockStatementContext statementWrapper : rawStatements) {
                if (statementWrapper.statement() != null) {
                    if (statementWrapper.statement().statement().isEmpty()) {
                        for (RuvaParser.ExpressionContext expression : statementWrapper.statement().expression()) {
                            System.out.println("Ok");
                        }
                    } else {
                        throw new RuntimeException("Probably a lambda? We cant handle those yet :(");
                    }
                } else if (statementWrapper.localVariableDeclaration() != null) {
                    statements.add(readLocalVarDecl(statementWrapper.localVariableDeclaration()));
                } else {
                    System.err.println("Unable to parse block statement wrapper.");
                }
            }
        }

        return statements;
    }

    private VariableDeclaration readLocalVarDecl(RuvaParser.LocalVariableDeclarationContext ctx) {
        RuvaParser.VariableDeclaratorContext variableDeclarator = ctx.variableDeclarators().variableDeclarator(0);
        String variableName = getName(variableDeclarator.variableDeclaratorId());
        Type variableType = getType(ctx.typeType());
        Expression expression = Expression.get(variableDeclarator.variableInitializer().expression());
        return new VariableDeclaration(variableName, variableType, true, expression);
    }

    protected List<MethodParameter> getParameters(RuvaParser.FormalParametersContext ctx) {
        ArrayList<MethodParameter> methodParameters = new ArrayList<>();
        RuvaParser.FormalParameterListContext rawParamList = ctx.formalParameterList();

        if (rawParamList != null) {
            for (RuvaParser.FormalParameterContext rawParameter : rawParamList.formalParameter()) {
                Type type = getType(rawParameter.typeType());
                String name = getName(rawParameter.variableDeclaratorId().identifier());
                methodParameters.add(new MethodParameter(name, type));
            }
        }
        return methodParameters;
    }

    protected Visibility getMethodVisibility(RuvaParser.MethodDeclarationContext ctx) {
        RuvaParser.ModifierContext modifier = ((RuvaParser.ClassBodyDeclarationContext) ctx.parent.parent).modifier(0);
        if (modifier == null) {
            return Visibility.NONE;
        }

        RuvaParser.ClassOrInterfaceModifierContext classModifier = modifier.classOrInterfaceModifier();
        if (classModifier.PUBLIC() != null) {
            return Visibility.PUBLIC;
        } else if (classModifier.PRIVATE() != null) {
            return Visibility.PRIVATE;
        } else if (classModifier.PROTECTED() != null) {
            return Visibility.NONE;
        } else {
            throw new RuntimeException("Unsupported Visibility modifier on method '" + getName(ctx.identifier()) + "' called '" + getName(modifier) + "'.");
        }
    }

    public static String getName(ParseTree node) {
        if (node instanceof TerminalNode terminalNode) {
            return terminalNode.toString();
        } else if (node == null) {
            throw new RuntimeException("Tried reading the name of a node which is null!");
        } else {
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < node.getChildCount(); i++) {
                output.append(getName(node.getChild(i)));
            }

            return output.toString();
        }
    }

    protected Type getType(RuvaParser.TypeTypeContext ctx) {
        return Type.from(getName(ctx));
    }

    protected Type getType(RuvaParser.TypeTypeOrVoidContext ctx) {
        if (ctx.VOID() != null) {
            return null;
        }

        return getType(ctx.typeType());
    }

    protected abstract void visitFieldDeclaration(RuvaParser.FieldDeclarationContext ctx);

    protected abstract void visitMethodDeclaration(RuvaParser.MethodDeclarationContext ctx);
}
