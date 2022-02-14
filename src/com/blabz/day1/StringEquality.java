package com.blabz.day1;

public class StringEquality {
    public static void main(String[] args) {
        String s1="sample";
        String s2="Sample";   //case-sensitive
        System.out.println(s1+" and "+s2+" "+" are "+(s1.equals(s2) ? "equal" : "not equal"));

    }
}
