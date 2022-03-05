package me.hydos.ruva;

import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Converts a Just project into buildable rust code in the <b>build</b> subdirectory
 */
public class ProjectConverter {

    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("java -jar Ruva.jar path/to/project");
            return;
        }

        String path = args.length == 0 ? System.getProperty("user.dir") : args[0];
        try {
            build(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException("Failed to build rust source.");
        }
    }

    public static void build(Path project) throws IOException {
        Path srcDir = project.resolve("src");
        Path rustSrcDir = project.resolve("build/src_rs");
        Files.createDirectories(rustSrcDir);
        Files.createDirectories(srcDir);

        Files.walk(srcDir).filter(path -> !Files.isDirectory(path)).forEach(path -> {
            try {
                Path rustOutPath = rustSrcDir.resolve(path.getFileName().toString().replace(".jrs", ".rs"));
                RustFile rustFile = Ruva.convertFile(CharStreams.fromPath(path));
                rustFile.write(rustOutPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
