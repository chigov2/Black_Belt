package main.java.Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(12);
        priorityQueue.add(13);
        priorityQueue.add(1);
        priorityQueue.add(-103);
        priorityQueue.add(-3);
        System.out.println(priorityQueue);
        System.out.println("peek:"+priorityQueue.peek());
        System.out.println("remove:"+priorityQueue.remove());
        System.out.println("remove:"+priorityQueue.remove());
        System.out.println("remove:"+priorityQueue.remove());
        System.out.println(priorityQueue);

    }
}
