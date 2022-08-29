package org.example;

public class AVGThread extends Thread{
    public Array arr;
    public AVGThread (Array arr){
        this.arr=arr;
    }
    public void run() {
        System.out.println("AVG " + arr.AVG());
    }

}
