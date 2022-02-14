package com.blabz.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner leapYear =new Scanner(System.in);
        System.out.println("Please enter a year:");
        int input=leapYear.nextInt();
        System.out.println(input);
        if(input>=1583) {
            System.out.println("Valid");
            if (input % 4 == 0 && input % 400 == 0) {
                System.out.println("The entered number is a leap year");
            } else{
                System.out.println("The entered number is not a leap year");
            }
    } else {
            System.out.println("Invalid");

        }
    }
}
