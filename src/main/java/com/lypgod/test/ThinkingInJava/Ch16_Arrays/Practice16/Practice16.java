package com.lypgod.test.ThinkingInJava.Ch16_Arrays.Practice16;

public class Practice16 {
    static class Integer implements SkipGenerator<java.lang.Integer> {
        private int value = 0;
        private int n;
        Integer(int n) { this.n = n; }
        public java.lang.Integer next() { return value++; }
        public java.lang.Integer next(int n) { return value += n; }
    }
    public static void main(String[] args) {
        Practice16.Integer integer = new Practice16.Integer(0);
        for (int i = 0; i < 3; i++) {
            System.out.println(integer.next(3));
        }
    }
}
