package com.java.patterns.Singleton;

public class SingletonPractice {
    private SingletonPractice singletonPractice;

    public SingletonPractice getObject() {
        if (this.singletonPractice == null)
            this.singletonPractice = new SingletonPractice();

        return this.singletonPractice;
    }
}
