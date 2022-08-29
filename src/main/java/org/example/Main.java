package org.example;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        /*  Задание 1
При старте приложения запускаются три потока. Первый поток заполняет массив случайными числами.
Два других потока ожидают заполнения. Когда массив заполнен оба потока запускаются.
Первый поток находит сумму элементов массива, второй поток среднеарифметическое значение в массиве.
Полученный массив, сумма и среднеарифметическое возвращаются в метод main, где должны быть отображены
*/

        Array arr=new Array(100);

        ArrThread fil = new ArrThread(arr);
        fil.start();
        try{
            fil.join();
            arr.Show();
        }
        catch(InterruptedException e){

            System.out.printf("%s has been interrupted", fil.getName());
        }
        System.out.println("Main ArrThread finished...");

        SumThread sum = new SumThread(arr);
        sum.start();
        System.out.println("Main SumThread finished...");

        AVGThread avg = new AVGThread(arr);
        avg.start();
        System.out.println("Main AVGThread finished...");

        System.out.println("---------------------------------");


    }
}
