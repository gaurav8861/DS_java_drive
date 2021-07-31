package MultiThreading;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class EvenODD{
    public void even(){
        for (int i=0 ;i< 10; i=i+2){
//            printEven(i);
//            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public void odd(){
        for (int i=1 ;i< 10; i=i+2){
//            printOdd(i);
//            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class PrinterEO implements Runnable{
    EvenODD evenODD;
    boolean isEven = false;

    public PrinterEO(EvenODD evenODD, boolean isEven){
        this.evenODD = evenODD;
        this.isEven = isEven;
    }

    @Override
    public void run() {
//        synchronized (this){
            if (isEven) {
                this.evenODD.even();
//                notifyAll();
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            else {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                this.evenODD.even();
//                notifyAll();
            }
        }
//    }
}




public class PCReadFile{


    public static void main(String[] args) throws InterruptedException {
        EvenODD evenODD = new EvenODD();
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        executor.submit(new PrinterEO(evenODD, true));
//        executor.submit(new PrinterEO(evenODD, false));
//
//        executor.shutdown();

        Thread t1 = new Thread(new PrinterEO(evenODD, true));
        Thread t2 = new Thread(new PrinterEO(evenODD, false));
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
