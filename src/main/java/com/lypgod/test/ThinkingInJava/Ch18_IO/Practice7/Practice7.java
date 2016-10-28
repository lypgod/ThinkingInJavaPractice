package com.lypgod.test.ThinkingInJava.Ch18_IO.Practice7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Practice7 {
    public static String readAndReverse(String filename) throws IOException {
        // Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder(); // For output String
        while ((s = in.readLine()) != null)
            list.add(s); // Add each line to LinkedList
        while (list.peekLast() != null) // While there is a lase line
            sb.append(list.pollLast()).append("\n"); // Removes line
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(readAndReverse("pom.xml"));
    }
}
