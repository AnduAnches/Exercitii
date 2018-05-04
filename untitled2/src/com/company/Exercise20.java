//20 & 21. Write a Java program to convert a decimal number to hexadecimal and octal number.

package com.company;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        System.out.println("Please insert number to be converted into hexadecimal and octal: ");
        Scanner inputNo = new Scanner(System.in);
        int number = inputNo.nextInt();

        String hexNumber = Integer.toHexString(number);
        System.out.println("Hexadecimal number is: " + hexNumber);

        String octNumber = Integer.toOctalString(number);
        System.out.println("Octal number is: " + octNumber);
    }
}
