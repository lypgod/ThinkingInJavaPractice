package com.lypgod.test.ThinkingInJava.Ch16_Arrays.Practice17;

import java.math.BigDecimal;
import java.util.Arrays;

class BigDecimalGenerator implements Generator<BigDecimal> {
    private BigDecimal bd = new BigDecimal(0.0);
    public BigDecimal next() {
        return bd = bd.add(new BigDecimal(1.0));
    }
}
public class Practice17 {
    public static void main(String[] args) {
        BigDecimal[] bda1 = new BigDecimal[4];
        Generated.array(bda1, new BigDecimalGenerator());
        System.out.println(Arrays.toString(bda1));
        BigDecimal[] bda2 = Generated.array(
                BigDecimal.class, new BigDecimalGenerator(), 5);
        System.out.println(Arrays.toString(bda2));
    }
}
