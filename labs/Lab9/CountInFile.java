//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.10.17
//lab 9

//12.12

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountInFile {
    public static void main(String[] args) {
        validateArgsCount(args);
        File file = new File(args[0]);
        validateFile(file);
        StringBuilder text = readFile(file);
        int characterCount = text.length();
        int wordCount = getWordCount(text);
        int lineCount = getLineCount(text);
        System.out.println(characterCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");

    }

    private static int getLineCount(StringBuilder text) {
        String[] lines = text.toString().split("\n");
        return lines.length;
    }

    private static int getWordCount(StringBuilder text) {
        String[] words = text.toString().split("\\s+");
        return words.length;
    }

    private static StringBuilder readFile(File file) {
        StringBuilder text = new StringBuilder();
        try (Scanner fileIn = new Scanner(file)) {
            while (fileIn.hasNext()) {
                text.append(fileIn.nextLine());
                if (fileIn.hasNext()) text.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("source file is not found");
            System.exit(0);
        }
        return text;
    }

    private static void validateFile(File file) {
        validateFileExists(file);
        validateFileIsFile(file);
        validateFileIsReadable(file);
    }

    private static void validateFileIsReadable(File file) {
        if (!file.canRead()) {
            System.out.println("The application cannot read the file denoted by this pathname.");
            System.exit(0);
        }
    }

    private static void validateFileIsFile(File file) {
        if (!file.isFile()) {
            System.out.println("The file denoted by this pathname is not a normal file.");
            System.exit(0);
        }
    }

    private static void validateFileExists(File file) {
        if (!file.exists()) {
            System.out.println("The file denoted by this pathname does not exist.");
            System.exit(0);
        }
    }

    private static void validateArgsCount(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid parameter count");
            System.exit(0);
        }
    }
}