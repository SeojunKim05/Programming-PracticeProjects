package lab02$arraylists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t  R  E  V  E  R  S  E    F  I  L  E    T  E  S  T");
        System.out.println(" \t \t      T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
    }

    public static void read(String inputLocation, List<String> list) throws FileNotFoundException {
        File file = new File(inputLocation);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            List<String> reversedWords = new ArrayList<>();
            for (int i = words.length - 1; i >= 0; i--) {
                reversedWords.add(words[i]);
            }
            String reversedLine = String.join (" ", reversedWords);
            list.add(reversedLine);
        }
        scanner.close();
    }

    public static void write(String outputLocation, List<String> list) throws FileNotFoundException {
        PrintStream writer = new PrintStream (outputLocation);
        for (String line : list) {
            writer.println(line);
        }
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String inputLocation = "." + File.separator + "data" + File.separator + "words.txt";
        String outputLocation = "." + File.separator + "results" + File.separator + "reverse_words.txt";
        List<String> reversedLines = new ArrayList<>();
        read(inputLocation,reversedLines);
        Collections.reverse(reversedLines);
        write(outputLocation,reversedLines);
    }
}
