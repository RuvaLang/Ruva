package me.hydos.ruva.visitor;

import me.hydos.ruva.RuvaSourceFile;
import me.hydos.ruva.antlr.RuvaParser;

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

        System.out.println(getType(ctx.typeTypeOrVoid()));
    }
}
