package main.java.MultiThreading;

public class GetName {
    public static void main(String[] args) {
    MyThread8 thread8 = new MyThread8();
    thread8.setName("MyThread8");
    thread8.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread8: " + thread8.getName()+ " Priority of thread8: "+ thread8.getPriority());

    }
}

class MyThread8 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
