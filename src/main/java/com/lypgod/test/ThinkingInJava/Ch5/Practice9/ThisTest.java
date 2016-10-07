package com.lypgod.test.ThinkingInJava.Ch5.Practice9;

class This {
    This() {
        System.out.println("This()");
    }
    This(String s) {
        this();
        System.out.println(s);
    }
}

public class ThisTest {
    public static void main(String[] args) {
        This aThis = new This("sssss");
    }
}
