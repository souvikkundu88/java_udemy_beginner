/*
Write a program to check if the number is positive ornegative.
*/

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a valid number: ");
        int num = scanner.nextInt();
        
        if ((num % 2) == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
        scanner.close();
    }
}