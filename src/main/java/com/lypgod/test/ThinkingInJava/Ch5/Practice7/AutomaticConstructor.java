package com.lypgod.test.ThinkingInJava.Ch5.Practice7;

class Aso {
    void bark() {System.out.println("woof");}
}

public class AutomaticConstructor {
    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
