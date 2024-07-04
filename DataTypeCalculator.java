/*
 Write a program to use all the data types 
 Perform arithmetic operations +, -. /, ++, --
 Check if inputs are valid or invalid
*/

import java.util.Scanner;

public class DataTypeCalculator {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {
            // get input with error checking
            System.out.println("Enter a byte value:");
            byte byteValue = scanner.nextByte();
            System.out.println("Enter a short value:");
            short shortValue = scanner.nextShort();
            System.out.println("Enter a int value:");
            int intValue = scanner.nextInt();
            System.out.println("Enter a long value:");
            long longValue = scanner.nextLong();
            System.out.println("Enter a float value:");
            float floatValue = scanner.nextFloat();
            System.out.println("Enter a double value:");
            double doubleValue = scanner.nextDouble();

            // calculations
            System.out.println("Calculations:");
            System.out.println("byteValue + shortValue = " + (byteValue + shortValue));
            System.out.println("intValue - longValue = " + (intValue - longValue));
            System.out.println("floatValue / doubleValue = " + (floatValue / doubleValue));
            
            // Increment and Decrement
            intValue++;
            System.out.println("intValue after increment: " + intValue);
            longValue--;
            System.out.println("longValue after decrement: " + longValue);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid  numeric values");
        } finally {
            scanner.close();
        }
    }
}