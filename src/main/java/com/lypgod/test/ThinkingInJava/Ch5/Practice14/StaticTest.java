package com.lypgod.test.ThinkingInJava.Ch5.Practice14;

class Static{
    static String s1 = "String 1";
    static String s2;
    static {
        s2 = "String 2";
    }

    static void print() {
        System.out.println(s1);
        System.out.println(s2);
    }
}

public class StaticTest {

    public static void main(String[] args) {
        Static.print();
    }
}
