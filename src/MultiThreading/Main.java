package MultiThreading;

class EvenOdd extends Thread{
    Printer printer;
    boolean isEven;
    public EvenOdd(Printer printer, boolean isEven) {
        this.printer = printer;
        this.isEven = isEven;

    }
    public synchronized void run(){
        if (isEven){
            printer.printEven();
            try{wait();}catch (Exception e){e.printStackTrace();}
            notify();
        }else{
            printer.printOdd();
            try{wait();}catch (Exception e){e.printStackTrace();}
            notify();
        }

    }
}

class Printer{
    int range;
    public Printer(int range){
        this.range = range;
    }
    public void printEven(){
        for (int i=0; i <= range; i+=2){
            System.out.println("Even : "+ i + " " + Thread.currentThread().getName());
        }

    }
    public void printOdd(){
        for (int i=1; i <= range; i+=2){
            System.out.println("Odd : "+ i + " " + Thread.currentThread().getName());
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Printer printer = new Printer(10);
        EvenOdd t1 = new EvenOdd(printer, true);
        EvenOdd t2 = new EvenOdd(printer, false);
        t1.start();
        t2.start();
    }
}
