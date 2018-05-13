/*
    1. Loop through the months
    2. Print the number of a month read from keyboard;
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        loopMonths();
        System.out.println("");
        Scanner inputMonth = new Scanner(System.in);

        while (true) {
            System.out.println("Please insert month. Press Enter to quit ");
            String monthName = inputMonth.nextLine();

            if (monthName.length() == 0) {
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Month name is invalid! ");
            } else {
                System.out.println(monthName + " has the number " + monthNumber);
            }
        }

    }

    private static void loopMonths() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

    private static int getMonthNumber(String monthName) {
        for (int i = 0; i < months.length; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                return i + 1;
            }
        }
        return -1;
    }
}
