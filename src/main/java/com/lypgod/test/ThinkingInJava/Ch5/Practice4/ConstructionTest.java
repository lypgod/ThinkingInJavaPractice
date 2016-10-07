package com.lypgod.test.ThinkingInJava.Ch5.Practice4;

public class ConstructionTest {
    ConstructionTest(String s) {
        System.out.println("Constructed. " + s);
    }

    public static void main(String[] args) {
        ConstructionTest constructionTest = new ConstructionTest("args");
    }
}
