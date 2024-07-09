/*
Write a program to check if the number is positive or negative.
*/

import java.util.Scanner;

public class PostvNegtvZero {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a valid number: ");
        int num = scanner.nextInt();
        
        if (num == 0) {
            System.out.println(num + " is a zero");
        } else if (num > 0) {
            System.out.println(num + " is a positive number");
        } else {
            System.out.println(num + " is a negative number");
        }
        scanner.close();
    }
}