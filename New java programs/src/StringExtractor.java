import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractor {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
// Read input string from file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String inputString = reader.readLine();
            reader.close();

// Define regular expressions for numbers and special characters
            String numberPattern = "\\d+";
            String specialCharPattern = "[^a-zA-Z0-9\\s]";

// Initialize pattern objects
            Pattern numberRegex = Pattern.compile(numberPattern);
            Pattern specialCharRegex = Pattern.compile(specialCharPattern);

// Initialize matchers
            Matcher numberMatcher = numberRegex.matcher(inputString);
            Matcher specialCharMatcher = specialCharRegex.matcher(inputString);

// Extract numbers and special characters
            StringBuilder extractedNumbers = new StringBuilder();
            StringBuilder extractedSpecialChars = new StringBuilder();

            while (numberMatcher.find()) {
                extractedNumbers.append(numberMatcher.group()).append(" ");
            }

            while (specialCharMatcher.find()) {
                extractedSpecialChars.append(specialCharMatcher.group()).append(" ");
            }

// Write results to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("Extracted Numbers: " + extractedNumbers.toString() + "\n");
            writer.write("Extracted Special Characters: " + extractedSpecialChars.toString() + "\n");
            writer.close();

            System.out.println("Extraction completed. Results written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}