/*
Write a program to print 10 even and 10 odd numbers 

use for-loop
*/

public class TenEvenOdd {
    public static void main (String args[]) {
        int even = 2, odd = 1;
        System.out.println("even num1 = " + even + " odd num1 = " + odd);
        for (int i = 2; i < 11; i++) {
            even = even + 2;
            odd = odd + 2;
            System.out.println("even " + "num"+i+ " = " + even + " odd " + "num"+i+ " = " + odd);
        }
    }
}

