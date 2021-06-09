

class Sample implements Runnable{
    private Thread t;
    private String threadName;

    Sample(String threadName){
        this.threadName = threadName;

    }


    public void run() {
        while(true){
            System.out.println(threadName);
        }
    }
    public void start(){
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
public class ha {
    public static void main(String[] args) {
        Sample A = new Sample("A");
        Sample B = new Sample("B");
        B.start();
        A.start();
    }
}
