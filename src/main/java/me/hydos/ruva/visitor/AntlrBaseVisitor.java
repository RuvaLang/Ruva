package me.hydos.ruva.visitor;

import me.hydos.ruva.antlr.RuvaParser;
import me.hydos.ruva.type.Type;
import org.antlr.v4.runtime.tree.*;

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

    protected String getName(ParseTree node) {
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

    protected Type getType(RuvaParser.TypeTypeOrVoidContext ctx) {
        if (ctx.VOID() != null) {
            return null;
        }

        return Type.from(getName(ctx.typeType()));
    }

    protected abstract void visitFieldDeclaration(RuvaParser.FieldDeclarationContext ctx);

    protected abstract void visitMethodDeclaration(RuvaParser.MethodDeclarationContext ctx);
}
