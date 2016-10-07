package com.lypgod.test.ThinkingInJava.Ch5.Practice18;

class Init {
    Init(String s) {
        System.out.println(s);
    }
}

public class InitTest {
    public static void main(String[] args) {
        Init[] it = {new Init("a"), new Init("b"), new Init("c")};
    }
}
