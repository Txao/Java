package com.java.practice.p5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolPractice {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++)
            executorService.submit(new Work(i));

        executorService.shutdown();
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + " was completed");
    }
}
