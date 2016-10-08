package com.lypgod.test.ThinkingInJava.Ch5_InitializationAndCleanup.Practice3;

public class ConstructionTest {
    ConstructionTest() {
        System.out.println("Constructed.");
    }

    public static void main(String[] args) {
        ConstructionTest constructionTest = new ConstructionTest();
    }
}
