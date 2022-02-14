package com.blabz.day1;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int invalidInputs = 0;
            for (int i = 0; i < args.length; i++) {
                try {
                    sum+=Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    invalidInputs++;
                }
            }
            System.out.println("Sum of command line args is :"+sum);
        System.out.println("Invalid inputs count :"+invalidInputs);
    }
}
