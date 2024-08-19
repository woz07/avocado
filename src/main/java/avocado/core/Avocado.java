package avocado.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Avocado {
    public static void main(String[] args) {
        // This is incorrect, I want the ';' to be the end of line word
        // This way it will just continuously keep reading EACH line, ignoring the ';' rule.
        // TODO: FIX

        // The integer stores the line number and the <String, Token> stores the words and its token
        HashMap<Integer, HashMap<String, Tokens>> tokenized = new HashMap<>();
        try {
            File input = new File(args[0]);
            Scanner reader = new Scanner(input);
            int index = 0;
            // Parse each line and store it within
            while (reader.hasNextLine()) {
                tokenized.put(index, Tokenizer.tokenize(reader.nextLine()));
            }
            reader.close();
        } catch (FileNotFoundException ffe) {
            System.err.println("AVO-001: The provided input file, " + args[0] + ", could not be found.");
        }
    }
}