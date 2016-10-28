package com.lypgod.test.ThinkingInJava.Ch17_Containers.Practice29;

public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam tp);
} ///:~
