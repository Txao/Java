package com.java.practice.p3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());

        //sorted order
    }
}
