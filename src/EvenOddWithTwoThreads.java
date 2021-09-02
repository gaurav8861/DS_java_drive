class EvenOdd {

    int counter = 1;
    int n = 10;

    public void printEven() throws InterruptedException {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 != 0) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printOdd() throws InterruptedException {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 0) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }
}

public class EvenOddWithTwoThreads {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        Runnable even = new Runnable() {
            @Override
            public void run() {
                try {
                    eo.printEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable odd = new Runnable() {
            @Override
            public void run() {
                try {
                    eo.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread evenThread = new Thread(even, "EVEN");
        Thread oddThread = new Thread(odd, "ODD");
        evenThread.start();
        oddThread.start();
    }
}
