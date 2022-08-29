package org.example;

import java.util.concurrent.Exchanger;

public class SumThread extends Thread {
    public Array arr;
    public SumThread (Array arr){
        this.arr=arr;
    }
    public void run() {
        System.out.println("Summa " + arr.Summa());
    }
}
