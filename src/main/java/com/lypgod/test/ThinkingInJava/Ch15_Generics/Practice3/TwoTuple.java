//: net/mindview/util/TwoTuple.java
package com.lypgod.test.ThinkingInJava.Ch15_Generics.Practice3;

public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
} ///:~
