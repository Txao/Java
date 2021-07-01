package com.java.practice.p1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(i);

        list.remove(5);

        //System.out.println(list);
        //System.out.println(list.size());
    }
}
