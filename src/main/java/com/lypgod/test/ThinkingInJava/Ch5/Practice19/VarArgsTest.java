package com.lypgod.test.ThinkingInJava.Ch5.Practice19;

public class VarArgsTest {
    static void print(String... args) {
        for(String s:args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print("aaa", "bbb", "ccc");
        print(new String[]{"ddd", "eee", "fff"});
    }
}
