//: polymorphism/shape/Square.java
package com.lypgod.test.ThinkingInJava.Ch8_Polymorphism.Practice4;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
} ///:~
