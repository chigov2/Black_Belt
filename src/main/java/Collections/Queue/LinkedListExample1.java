package main.java.Collections.Queue;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Mike");
        linkedList.add("Lena");
        linkedList.add("Alex");
        linkedList.add("Anton");
        linkedList.add("Valya");
        linkedList.offer("Tonya");
        System.out.println(linkedList);
        System.out.println(linkedList.remove());
        System.out.println(linkedList);
        System.out.println(linkedList.element());
        System.out.println("poll: "+ linkedList.poll());
        System.out.println("element: "+ linkedList.element());
        System.out.println("poll: "+ linkedList.poll());
        System.out.println("element: "+ linkedList.element());
        System.out.println("poll: "+ linkedList.poll());
        System.out.println("element: "+ linkedList.element());
        System.out.println("poll: "+ linkedList.poll());
        System.out.println("element: "+ linkedList.element());
        System.out.println("poll: "+ linkedList.poll());
        System.out.println("element: "+ linkedList.peek());
        System.out.println("poll: "+ linkedList.poll());
        System.out.println(linkedList);
    }
}
