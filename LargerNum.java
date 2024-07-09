/*
Write a program to find largest of two numbers.

steps:

import java.util.Scanner

prompt user for num1 input

read and store num1

prompt user for num2 input

compare: if num1 is greater than num2 then print num1, if num2 > num1 then print num2, else print both are equal

scanner.close()
*/

import java.util.Scanner;

public class LargerNum {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter num 1");
        int num1 = scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter num 1");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " is greater than num2");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than num1");
        } else {
            System.out.println(num1 + num2 + " are both equal");
        }
        scanner.close();
    } 
}