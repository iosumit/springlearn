package com.springlearn.threading;

public class Threading {
    public static void main(String[] args) {

        // Thread thread = new Thread(new DownloadFileTask(), "!!!");
        // thread.start();

        for (int i = 0; i >= 0; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

        System.out.println("Main Thread : " + Thread.currentThread().getId());

        // Returns Current Application running core count
        System.out.println(Thread.activeCount());

        // Returns all core count
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}
