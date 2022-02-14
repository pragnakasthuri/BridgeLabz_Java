package com.blabz.day1;

import java.util.Scanner;

public class CommandLineInput {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your name...");
        System.out.println("Hi "+inputScanner.next());
        inputScanner.close();
    }
}
