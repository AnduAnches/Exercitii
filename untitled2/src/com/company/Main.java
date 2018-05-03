//7. Write a Java program that takes a number as input and prints its multiplication table upto 10

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("please insert number: ");
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt(); //number declared by user
        int i = 0; //incrementor

        while (i<10){
            i++;
            int result = a*i;
            System.out.println(result);
        }

    }
}
