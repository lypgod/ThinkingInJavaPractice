package com.lypgod.test.ThinkingInJava.Ch17_Containers.Practice3;

import com.lypgod.test.ThinkingInJava.Ch17_Containers.Countries;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        Set<String> countryHashSet = new HashSet<>();
        Set<String> countryLinkedHashSet = new LinkedHashSet<>();
        Set<String> countryTreeSet = new TreeSet<>();
        for (int i = 0; i < Countries.DATA.length; i++) {
            if (Countries.DATA[i][0].startsWith("A")) {
                countryHashSet.add(Countries.DATA[i][0]);
                countryLinkedHashSet.add(Countries.DATA[i][0]);
                countryTreeSet.add(Countries.DATA[i][0]);
            }
        }
        System.out.println(countryHashSet);
        System.out.println(countryLinkedHashSet);
        System.out.println(countryTreeSet);
        System.out.println();
        for (int i = 0; i < Countries.DATA.length; i++) {
            if (Countries.DATA[i][0].startsWith("A")) {
                countryHashSet.add(Countries.DATA[i][0]);
                countryLinkedHashSet.add(Countries.DATA[i][0]);
                countryTreeSet.add(Countries.DATA[i][0]);
            }
        }
        System.out.println(countryHashSet);
        System.out.println(countryLinkedHashSet);
        System.out.println(countryTreeSet);
    }
}
