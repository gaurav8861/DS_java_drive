package MultiThreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ProducerConsumerThread {
    Queue<Integer> data = new LinkedList<>();

    public void produce(int item) {
        data.add(item);
    }
    public void consumer(){
        data.remove();
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        ProducerConsumerThread pc = new ProducerConsumerThread();

    }
}
