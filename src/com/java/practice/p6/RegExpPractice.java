package com.java.practice.p6;

public class RegExpPractice {
    public static void main(String[] args) {
        /*
            \\d - одна цира
            \\w - одна английская буква (\\w == [a-zA-Z])

            + - 1 или более цифр
            * - 0 или более символов
            ? - 0 или 1 символов до
            . - любой символ

            ([x|y|z]) - одна строка из множества строк
            [a-zA-Z] - все английские буквы
            [^abc] - все символы кроме a, b и c
            {x} - количество предыдущих символов (x = 1, 2, ..., n)
            {x, } - количество предыдущих символов х или более
            {x, y} - количество предыдущих символов от х до y
         */

        String a = "+1234";
        System.out.println(a.matches("([-+])?\\d*"));

        //

        String b = "abc1234";
        System.out.println(b.matches("[a-zA-Z]+\\d+"));

        //

        String url = "https://www.google.com";
        System.out.println(url.matches("https://www\\..+\\.(ru|com)"));

        //

        String c = "1234";
        System.out.println(c.matches("\\d{4}"));
    }
}
