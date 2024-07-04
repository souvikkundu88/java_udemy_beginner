/*
Write a program to check if a candidate is eligible for voting or not
 */

import java.util.Scanner;

public class VotingAge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age:");
        // byte byteValue = scanner.nextByte();
        int age = scanner.nextInt();
        System.out.println();
        if (age > 17) {
            System.out.println(age + " is eligible for casting a vote");
        } else {
            System.out.println(age + " is not eligible for casting a vote");
        }
        scanner.close();
    }

}
