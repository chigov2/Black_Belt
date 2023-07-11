package main.java.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addFirst(7);
        deque.addLast(67);
        deque.offerLast(14);
        System.out.println("deque getfirst:"+deque.getFirst());
        System.out.println(deque);
        System.out.println("deque getfirst:"+deque.getFirst());
        System.out.println("deque getLast:"+deque.getLast());
        System.out.println("deque removeLast:"+deque.removeLast());
        System.out.println(deque);
        System.out.println("deque getLast:"+deque.getLast());

    }
}
