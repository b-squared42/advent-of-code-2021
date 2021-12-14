package de.b_sqr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] inputLines = readInput();
        assert inputLines != null;
        day9point1(inputLines);
//        day9point2(inputLines);

    }

    private static void day9point1(String[] inputLines) {
        
    }
    private static void day9point2(String[] inputLines) {

    }



    public static String[] readInput() {
        try {
            List<String> input = new ArrayList<>();
            File inputFile = new File("input_test.txt");
            System.out.println(inputFile.getAbsolutePath());
            Scanner myReader = new Scanner(inputFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                input.add(data);
            }
            myReader.close();
            return input.toArray(new String[0]);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
