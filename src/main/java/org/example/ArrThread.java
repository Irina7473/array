package org.example;

import java.util.concurrent.Exchanger;

public class ArrThread extends Thread {

    public Array arr;
    public ArrThread(Array arr){
        this.arr=arr;
    }
    public void run() {
        arr.FilArray();
    }
}
