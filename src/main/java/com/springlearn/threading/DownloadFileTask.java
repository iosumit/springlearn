package com.springlearn.threading;

public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Download file on Thread : " + Thread.currentThread().getId());
    }
}
