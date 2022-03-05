package me.hydos.ruva;

import me.hydos.antlr.JustLexer;
import me.hydos.antlr.JustParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

public class Ruva {

    public static RustFile convertFile(CharStream file) {
        JustParser parser = new JustParser(new CommonTokenStream(new JustLexer(file)));
        JustParser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();

        RuvaVisitor visitor = new RuvaVisitor(file.getSourceName().replace(".jrs", ".rs"));
        compilationUnitContext.accept(new AbstractParseTreeVisitor<>() {

            @Override
            public Object visitChildren(RuleNode node) {
                if(node instanceof JustParser.FieldDeclarationContext ctx) {
                    visitor.visitFieldDeclaration(ctx);
                }

                if(node instanceof JustParser.MethodDeclarationContext ctx) {
                    visitor.visitMethodDeclaration(ctx);
                }

                return super.visitChildren(node);
            }
        });
        return visitor.rustFile;
    }
}
