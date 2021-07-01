package com.java.practice.p6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice2 {
    public static void main(String[] args) {
        String text = "Abc abc abc abc email@yahoo.com abc abc email2@gmail.com";

        Pattern email = Pattern.compile("(\\w+)@(yahoo|gmail)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find())
            System.out.println(matcher.group());
    }
}
