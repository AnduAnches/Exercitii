
//17. Write a Java program to add two binary numbers

package com.company;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner binaryInput = new Scanner(System.in);
        System.out.println("Please insert first binary number: ");
        String a = binaryInput.next();
        System.out.println("Please insert second binary number: ");
        String b = binaryInput.next();

        int aDecimal = Integer.parseInt(a, 2);
        int bDecimal = Integer.parseInt(b, 2);
        int resultDecimal = aDecimal + bDecimal;

        System.out.println( "The sum of the two binary numbers is: " + Integer.toBinaryString(resultDecimal));
    }

}
