package com.lypgod.test.ThinkingInJava.Ch9_Interfaces.Practice17;

interface Days {
    int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4,
            THURSDAY = 5, FRIDAY = 6, SATURDAY = 7;
}

class Week implements Days {
    private static int count = 0;

    public Week() {
        System.out.println("Week() " + count++);
    }
}

public class Practice17 {
    public static void main(String[] args) {
        // Without any objects, static fields exist:
        System.out.println("SUNDAY = " + Days.SUNDAY);
        System.out.println("MONDAY = " + Days.MONDAY);
        Week w0 = new Week();
        Week w1 = new Week();
        // Error: cannot assign a value to final variable SUNDAY:
        // w.SUNDAY = 2;
        // Error: cannot assign a value to final variable MONDAY:
        // w1.MONDAY = w0.MONDAY;
    }
}
