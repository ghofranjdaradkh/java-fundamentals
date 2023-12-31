/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import  java.util.ArrayList;

public class App {


    public static void main(String[] args) {


        try {
            // Define the path to the JavaScript file
        Path filePath = Path.of("./app/src/main/resources/gates.js");
            System.out.println(JavaScriptLinter(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List JavaScriptLinter(Path filePath) throws IOException {

        List<String> errorsList = new ArrayList<>();//  initialize to store the errors massages in list

        // Read all lines from the file and store them in a list
        List<String> allLines = Files.readAllLines(filePath);
        // Loop through each line in the list
        for (int num = 0; num < allLines.size(); num++) {

            // Get the current line and remove leading and trailing whitespace
            String line = allLines.get(num).trim();

            // Check if the line is not empty and doesn't end with {, }, if, else, or ;
            if (!line.isEmpty() && !line.endsWith("{") && !line.endsWith("}") &&
                    !line.startsWith("if") && !line.startsWith("else") && !line.endsWith(";")) {
                // Print an error message
                errorsList.add("Error: Missing semicolon at line " + (num + 1)+ "\n");
            }

        }    return errorsList;
    }

}


