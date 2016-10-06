package com.lypgod.test.ThinkingInJava.Ch21.Practice13;//: concurrency/SerialNumberGenerator.java

class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    static synchronized int nextSerialNumber() {
        return serialNumber++; // Not thread-safe
    }
} ///:~
