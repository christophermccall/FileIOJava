package Step2;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadTwo
{
    public static void main(String[] args)
    {
        try {
            Scanner fileIn = new Scanner(new File(ReadTwo.class.getResource("input.txt").getFile()));

            while (fileIn.hasNext()) 
            {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine(); 
                // Split the line into a String array
                String[] input = lineIn.split(",");
                int sum = 0;
                for (String s : input) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}