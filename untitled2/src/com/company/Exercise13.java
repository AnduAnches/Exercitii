//Write a Java program to print the area and perimeter of a rectangle

package com.company;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please insert rectangle width: ");
        double width = userInput.nextDouble();
        System.out.println("Please insert rectangle height: ");
        double height = userInput.nextDouble();

        double area = width * height;
        double perimeter = (width + height) * 2;

        System.out.printf( "The rectangle area is: %.2f \n", area);
        System.out.printf( "The rectangle perimeter is: %.2f", perimeter );
    }
}
