/*
 Write programs to use all the data types 
 and given arithmetic operations +, -. /, ++, --

 tasks:
 import scanner
 create main class
 take input from user
 perform arithmetic operation
 print the result
*/

import java.util.Scanner;

public class DataTypesAndOperators {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        // integer operations
        System.out.println("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1++ = " + (num1++));
        System.out.println("num1-- = " + (num2--));
    }
}