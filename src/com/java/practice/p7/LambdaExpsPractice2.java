package com.java.practice.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpsPractice2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        // map method
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        // filter method
        arr1 = Arrays.stream(arr1).filter(a -> a % 2 == 0).toArray();
        list1 = list1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        // foreach
        Arrays.stream(arr1).forEach(System.out::println);
        list1.forEach(System.out::println);

        // reduce
        int arrSum = Arrays.stream(arr1).reduce((acc, b) -> acc + b).getAsInt();
        int listSum = list1.stream().reduce((acc, b) -> acc + b).get();

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);


    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
