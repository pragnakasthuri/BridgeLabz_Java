package com.blabz.day1;

public class StaticDemonstration {
    static String name = "Pragna";
    private String name2 = "Adla";

    static {
        System.out.println("Static block");
    }

    public static void sayHello() {
        System.out.println("Hello " +name);
    }


    public static void main(String[] args) {
        sayHello();
        System.out.println(name);

        StaticDemonstration instance1 = new StaticDemonstration();
        instance1.name2 = "Naresh";
        instance1.name = "Kasthuri";
        System.out.println(instance1.name2);
        System.out.println(instance1.name);

        StaticDemonstration instance2 = new StaticDemonstration();
        System.out.println(instance2.name2);
        System.out.println(instance2.name);
    }
}
