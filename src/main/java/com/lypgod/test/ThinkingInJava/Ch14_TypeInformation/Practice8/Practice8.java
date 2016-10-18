package com.lypgod.test.ThinkingInJava.Ch14_TypeInformation.Practice8;


class A {}

class B extends A {}

class C extends B {}

public class Practice8 {
    static void printHeritance(Object o) throws IllegalAccessException, InstantiationException {
        if (o != null) {
            System.out.println(o.toString());
            printHeritance(o.getClass().getSuperclass().newInstance());
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        printHeritance(new C());
    }
}
