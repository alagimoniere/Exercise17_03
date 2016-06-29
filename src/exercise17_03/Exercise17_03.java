package exercise17_03;

import java.io.*;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.util.Random;

public class Exercise17_03 {

    public static void main(String[] args) throws IOException {

        
       
        /** Fill with unspecified number of integers */
        try (
            /** Create binary file */
             DataOutputStream integers = 
                new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
            ) {
                Random random = new Random();
                for (int i = 0; i < random.nextInt(100); i++) {
                    integers.writeInt(i);
                }
            }
        
        /** Read file */
        try (
            FileInputStream input = new FileInputStream("Exercise17_03.dat");
            ) {
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
            } 
        
        /** Print sum */
        int value = 0;
        int sum = 0;
        DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"));
        while (input.available() > 0)
            sum += input.readInt();
                System.out.println("\nSum: " + sum);
        
    }
    
}
