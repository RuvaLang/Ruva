package me.hydos.ruva.visitor;

import me.hydos.ruva.AntlrBaseVisitor;
import me.hydos.ruva.MethodParameter;
import me.hydos.ruva.RuvaSourceFile;
import me.hydos.ruva.antlr.RuvaParser;
import me.hydos.ruva.Type;
import me.hydos.ruva.statements.Statement;

import java.util.List;

public class AntlrTreeReaderVisitor extends AntlrBaseVisitor {

    public final RuvaSourceFile file;

    public AntlrTreeReaderVisitor() {
        this.file = new RuvaSourceFile();
    }

    @Override
    protected void visitFieldDeclaration(RuvaParser.FieldDeclarationContext ctx) {
    }

    @Override
    protected void visitMethodDeclaration(RuvaParser.MethodDeclarationContext ctx) {
        String functionName = getName(ctx.identifier());
        Type returnType = getType(ctx.typeTypeOrVoid());
        Visibility visibility = getMethodVisibility(ctx);
        List<MethodParameter> methodParameters = getParameters(ctx.formalParameters());
        List<Statement> statements = getStatements(ctx.methodBody().block());

        System.out.println("ok");
    }
}
