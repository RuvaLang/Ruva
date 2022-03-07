package me.hydos.ruva;

import me.hydos.ruva.antlr.RuvaLexer;
import me.hydos.ruva.antlr.RuvaParser;
import me.hydos.ruva.visitor.AntlrTreeReaderVisitor;
import me.hydos.ruva.writer.RustSourceWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Path;

public class Ruva {

    /**
     * Converts a Ruva source file into a Rust source file.
     *
     * @param file the path to the file you would like to convert
     * @return rust version of the Ruva source
     */
    public static String convertFile(Path file) {
        CharStream stream = asStream(file);
        RuvaParser parser = new RuvaParser(new CommonTokenStream(new RuvaLexer(stream)));
        AntlrTreeReaderVisitor visitor = new AntlrTreeReaderVisitor();
        parser.compilationUnit().accept(visitor);

        RuvaSourceFile sourceFile = visitor.file;
        return RustSourceWriter.writeFile(sourceFile);
    }

    private static CharStream asStream(Path file) {
        try {
            return CharStreams.fromPath(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to get CharStream from path. ", e);
        }
    }
}
