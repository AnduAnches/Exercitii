package com.company;

import java.util.Scanner;

public class Exercise33 {

   public static void main(String[] args){

            Scanner userInput = new Scanner(System.in);
            System.out.println("Please insert integer number:");
            String number = userInput.next();
            int noOfDigits = number.length();
            int[] currentElement = new int[noOfDigits];
            int sum = 0;

            for (int i=0; i < noOfDigits ; i++ ) {
                currentElement[i] = Integer.parseInt(number[i]);
                sum = sum + currentElement[i];
            }
            System.out.println("The sum of the number's digits is: " + sum);
    }

}
