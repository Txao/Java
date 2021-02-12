package com.java.practice.p3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> linkedHM = new LinkedHashMap<>();
        linkedHM.put(1, "One");
        linkedHM.put(2, "Two");
        linkedHM.put(3, "Three");

        for (Map.Entry<Integer, String> entry : linkedHM.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());

        //fixed order
    }
}
