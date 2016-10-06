package com.lypgod.test.ThinkingInJava.Ch2.Practice8;

class StaticFiled {
    static int i = 47;
    void increment() {
        i++;
    }
}
public class StaticFieldTest {
    public static void main(String[] args) {
        StaticFiled staticFiled1 = new StaticFiled();
        System.out.println(staticFiled1.i);
        StaticFiled staticFiled2 = new StaticFiled();
        staticFiled2.increment();
        System.out.println(staticFiled2.i);
    }
}
