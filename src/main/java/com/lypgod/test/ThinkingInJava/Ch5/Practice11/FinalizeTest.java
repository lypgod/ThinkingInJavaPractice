package com.lypgod.test.ThinkingInJava.Ch5.Practice11;

class Finalize {
    protected void finalize() {
        System.out.println("Fianlize.");
    }
}

public class FinalizeTest {

    public static void main(String[] args) {
        Finalize finalize = new Finalize();
        finalize = null;
        System.gc();
        System.runFinalizersOnExit(true);
    }
}
