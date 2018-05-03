// Write a Java program that takes numbers as input to calculate and print the average of those numbers

package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise12 {
    public static void main(String [] args){
        System.out.println("Please insert numbers (separated by spaces): ");
        Scanner userInput = new Scanner(System.in);
        String numbers = userInput.nextLine(); // Numbers inserted by user
        StringTokenizer strToken = new StringTokenizer(numbers); // conversion to a string of numbers separated by spaces
        int length = strToken.countTokens(); // string length
        double[] currentElement = new double[length];
        double result = 0; //The final result

        for (int i = 0; i < length; i++){
            currentElement[i] = Double.parseDouble((String)strToken.nextElement());
            result = result + currentElement[i]/length;
        }


        System.out.println("The average is:" + result);
    }
}