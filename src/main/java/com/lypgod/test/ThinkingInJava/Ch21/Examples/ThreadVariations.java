package com.lypgod.test.ThinkingInJava.Ch21.Examples;//: concurrency/ThreadVariations.java
// Creating threads with inner classes.

import java.util.concurrent.*;

// Using a named inner class:
class InnerThread1 {
    private int countDown = 5;

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) return;
                    sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }

        public String toString() {
            return getName() + ": " + countDown;
        }
    }

    InnerThread1(String name) {
        Inner inner = new Inner(name);
    }
}

// Using an anonymous inner class:
class InnerThread2 {
    private int countDown = 5;

    InnerThread2(String name) {
        Thread t = new Thread(name) {
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) return;
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted");
                }
            }

            public String toString() {
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }
}

// Using a named Runnable implementation:
class InnerRunnable1 {
    private int countDown = 5;

    private class Inner implements Runnable {
        Thread t;

        Inner(String name) {
            t = new Thread(this, name);
            t.start();
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) return;
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
            }
        }

        public String toString() {
            return t.getName() + ": " + countDown;
        }
    }

    InnerRunnable1(String name) {
        Inner inner = new Inner(name);
    }
}

// Using an anonymous Runnable implementation:
class InnerRunnable2 {
    private int countDown = 5;

    InnerRunnable2(String name) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) return;
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted");
                }
            }

            public String toString() {
                return Thread.currentThread().getName() +
                        ": " + countDown;
            }
        }, name);
        t.start();
    }
}

// A separate method to run some code as a task:
class ThreadMethod {
    private int countDown = 5;
    private Thread t;
    private String name;

    ThreadMethod(String name) {
        this.name = name;
    }

    void runTask() {
        if (t == null) {
            t = new Thread(name) {
                public void run() {
                    try {
                        while (true) {
                            System.out.println(this);
                            if (--countDown == 0) return;
                            sleep(10);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("sleep() interrupted");
                    }
                }

                public String toString() {
                    return getName() + ": " + countDown;
                }
            };
            t.start();
        }
    }
}

public class ThreadVariations {
    public static void main(String[] args) {
        new InnerThread1("InnerThread1");
        new InnerThread2("InnerThread2");
        new InnerRunnable1("InnerRunnable1");
        new InnerRunnable2("InnerRunnable2");
        new ThreadMethod("ThreadMethod").runTask();
    }
} /* (Execute to see output) *///:~
