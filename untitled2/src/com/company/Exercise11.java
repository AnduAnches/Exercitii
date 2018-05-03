//Write a Java program to print the area and perimeter of a circle.

package com.company;
import java.util.Scanner;
import java.lang.Math.*;

public class Exercise11 {

    public static void main(String[] args){
        System.out.println("Please insert circle radius: ");
        Scanner userInput = new Scanner(System.in);
        double radius = userInput.nextDouble(); //Circle radius declared by user;
        System.out.println("Circle area is: " + Math.PI * radius * radius);
        System.out.println("Circle perimeter is: " + 2 * Math.PI * radius);

    }
}
