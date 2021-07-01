package com.java.practice.p7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpsPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("a");
        list.add("ab");

        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(list);
    }
}