package com.java.practice.p4;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //unique values
        //
    }

    public static void testSet(Set<String> temp) {
        temp.add("One");
        temp.add("Two");
        temp.add("Three");
        temp.add("One");

        for (String str : temp)
            System.out.println(str);
    }
}
