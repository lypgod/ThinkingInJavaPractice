package com.lypgod.test.ThinkingInJava.Ch12_ErrorHandlingWithExceptions.Practice24;

public class FailingConstructor {
    FailingConstructor() throws Exception {
        throw new Exception("Failing Constructor");
    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
