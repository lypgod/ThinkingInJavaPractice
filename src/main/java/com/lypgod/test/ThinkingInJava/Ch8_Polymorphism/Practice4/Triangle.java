//: polymorphism/shape/Triangle.java
package com.lypgod.test.ThinkingInJava.Ch8_Polymorphism.Practice4;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
} ///:~
