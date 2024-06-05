package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {
            Scanner filein = new Scanner(new File("/Users/chris/Projects/FileIOJava/Step4/input.txt"));
            int runningTotal = 0;
            while (filein.hasNextLine())
            {
            // Print out a running total of all the
            runningTotal += filein.nextInt();
            // values in the input file.
                System.out.println("Running total = " + runningTotal);
            }
        } catch (IOException e) {
            System.out.println("File not found");

        }
    }
}