import me.hydos.ruva.ProjectConverter;

import java.io.IOException;
import java.nio.file.Paths;

public class MainRustTest {

    public static void main(String[] args) throws IOException {
/*        CodePointCharStream balls = CharStreams.fromString(new String(MainRustTest.class.getResourceAsStream("/main.jrs").readAllBytes(), StandardCharsets.UTF_8), "main.jrs");
        RustFile rustFile = Just.convertFile(balls);
        rustFile.write();

        System.out.println("Done!");*/

        ProjectConverter.build(Paths.get("C:\\Users\\AllOsSuck\\Projects\\hYdos\\JustExampleProject"));
    }
}
