package com.java.practice.p2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        System.out.println(measureTime(arrayList));
        System.out.println(measureTime(linkedList));
    }

    public static long measureTime(List<Integer> list) {
        for (int i = 0; i < 100000; i++)
            list.add(i);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
            list.get(i);

        long end = System.currentTimeMillis();
        return end - start;
    }
}
