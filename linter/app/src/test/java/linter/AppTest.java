package linter;

import static linter.App.JavaScriptLinter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import linter.App;

import java.util.ArrayList;
public class AppTest {

    @Test
    void JavaScriptLinterTestOneError() throws IOException {
        Path filePath = Path.of("C:/Users/CW/java-fundamentals/linter/app/src/test/resources/oneError.js");
        List<String> errors = JavaScriptLinter(filePath);
        assertEquals(1, errors.size());

    }

    @Test
    void JavaScriptLinterTestNoError() throws IOException {

        Path filePath = Path.of("C:/Users/CW/java-fundamentals/linter/app/src/test/resources/noErrors.js");
        List errors = JavaScriptLinter(filePath);
        assertEquals(0, errors.size());
    }
    @Test
    public void testFewErrors() throws IOException {
        Path filePath = Path.of("C:/Users/CW/java-fundamentals/linter/app/src/test/resources/fewErrors.js");
        List errors = JavaScriptLinter(filePath);
        assertEquals(5, errors.size());

    }

    @Test
    public void testManyErrors() throws IOException {
        Path filePath = Path.of("C:/Users/CW/java-fundamentals/linter/app/src/test/resources/manyErrors.js");
        List errors = JavaScriptLinter(filePath);
        assertEquals(4, errors.size());
    }

    @Test
    public void testEmptyFile() throws IOException {
        Path filePath = Path.of("C:/Users/CW/java-fundamentals/linter/app/src/test/resources/emptyFile.js");
        List<String> errors = JavaScriptLinter(filePath);
        assertTrue(errors.isEmpty());}


}




