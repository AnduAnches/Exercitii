//32. Write a Java program to compare two numbers.

package com.company;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        System.out.println("This app will compare 2 numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert first number: ");
        int firstNo = input.nextInt();
        System.out.println("Please insert second number: ");
        int secondNo = input.nextInt();

        if (firstNo != secondNo) {
            System.out.println(firstNo + " != " + secondNo);
            if (firstNo < secondNo)
                System.out.println(firstNo + " < " + secondNo);
            else
                System.out.println(firstNo + " > " + secondNo);
        }else
            System.out.println(firstNo + " = " + secondNo);
    }
}
