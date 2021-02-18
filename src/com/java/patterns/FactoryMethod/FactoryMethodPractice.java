package com.java.patterns.FactoryMethod;

public class FactoryMethodPractice {
    private FactoryMethodPractice() {}

    // factory method
    public static FactoryMethodPractice getObject() {
        return new FactoryMethodPractice();
    }

    public void someMethod() {
        System.out.println("Some message...");
    }

    public static void main(String[] args) {
        FactoryMethodPractice fmp = FactoryMethodPractice.getObject();
        fmp.someMethod();
    }
}
