import me.hydos.ruva.RustFile;
import me.hydos.ruva.Ruva;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class MainRustTest {

    public static void main(String[] args) throws IOException {
        CodePointCharStream balls = CharStreams.fromString(new String(MainRustTest.class.getResourceAsStream("/main.jrs").readAllBytes(), StandardCharsets.UTF_8), "main.jrs");
        RustFile rustFile = Ruva.convertFile(balls);
        rustFile.write(Paths.get("testOutput.rs"));
        System.out.println("Done!");
    }
}
