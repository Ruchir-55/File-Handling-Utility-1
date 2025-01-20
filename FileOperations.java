import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileOperations {

    // Method to write text to a file
    public static void writeToFile(String fileName, String content) {
        try {
            // Create a FileWriter object to write to the file
            FileWriter writer = new FileWriter(fileName);
            
            // Write content to the file
            writer.write(content);
            
            // Close the writer to save changes
            writer.close();
            
            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read text from a file
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        
        try {
            // Read all lines from the file using Files.readAllLines
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            
            // Append each line to the content StringBuilder
            for (String line : lines) {
                content.append(line).append("\n");
            }
            
            System.out.println("Content read from " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        
        return content.toString();
    }

    // Method to modify content in the file (append new content)
    public static void modifyFile(String fileName, String additionalContent) {
        try {
            // Create a FileWriter object in append mode (true)
            FileWriter writer = new FileWriter(fileName, true);
            
            // Write additional content to the file
            writer.write(additionalContent);
            
            // Close the writer to save changes
            writer.close();
            
            System.out.println("Content appended to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // File name for testing
        String fileName = "example.txt";
        
        // Step 1: Write initial content to the file
        String initialContent = "This is the initial content of the file.\n";
        writeToFile(fileName, initialContent);
        
        // Step 2: Read and print the content from the file
        String contentRead = readFromFile(fileName);
        System.out.println("Content of the file after writing:");
        System.out.println(contentRead);
        
        // Step 3: Modify the file by appending additional content
        String additionalContent = "This is the additional content added to the file.\n";
        modifyFile(fileName, additionalContent);
        
        // Step 4: Read and print the modified content from the file
        contentRead = readFromFile(fileName);
        System.out.println("Content of the file after modification:");
        System.out.println(contentRead);
    }
}
