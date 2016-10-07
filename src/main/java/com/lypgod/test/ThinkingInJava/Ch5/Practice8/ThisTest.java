package com.lypgod.test.ThinkingInJava.Ch5.Practice8;

class This {
    void f1() {
        f2();
        this.f2();
    }
    void f2() {
        System.out.println("S2");
    }
}

public class ThisTest {
    public static void main(String[] args) {
        This aThis = new This();
        aThis.f1();
    }
}
