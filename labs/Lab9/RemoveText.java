//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.10.17
//lab 9

//12.11

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        validateArgsCount(args);
        File file = new File(args[1]);
        validateFile(file);
        ArrayList<StringBuilder> text = readFile(file);
        removeText(text, args[0]);
        writeFile(file, text);
    }

    private static void validateFile(File file) {
        validateFileExists(file);
        validateFileIsFile(file);
        validateFileIsReadable(file);
        validateFileIsWritable(file);
    }

    private static void validateFileIsWritable(File file) {
        if (!file.canWrite()) {
            System.out.println("The application cannot modify the file denoted by this pathname.");
            System.exit(0);
        }
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

    private static void writeFile(File file, ArrayList<StringBuilder> text) {
        try (PrintWriter fileOut = new PrintWriter(file)) {
            for (StringBuilder line : text) {
                fileOut.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("destination file is not found");
            System.exit(0);
        }
    }

    private static void removeText(ArrayList<StringBuilder> text, String s) {
        for (StringBuilder line : text) {
            while (line.indexOf(s) >= 0) {
                line.delete(line.indexOf(s), line.indexOf(s) + s.length());
            }
        }
    }

    private static ArrayList<StringBuilder> readFile(File file) {
        ArrayList<StringBuilder> text = new ArrayList<>();
        try (Scanner fileIn = new Scanner(file)){
            while (fileIn.hasNext()) {
                StringBuilder line = new StringBuilder(fileIn.nextLine());
                text.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("source file is not found");
            System.exit(0);
        }
        return text;
    }

    private static void validateArgsCount(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid parameter count");
            System.exit(0);
        }
    }
}