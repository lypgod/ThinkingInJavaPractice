package com.lypgod.test.ThinkingInJava.Ch12_ErrorHandlingWithExceptions.Practice14;//: exceptions/Switch.java

public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
} ///:~
