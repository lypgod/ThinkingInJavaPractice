package com.lypgod.test.ThinkingInJava.Ch3.Practice7;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(2) == 0 ? "正" : "反");
        }
    }
}
