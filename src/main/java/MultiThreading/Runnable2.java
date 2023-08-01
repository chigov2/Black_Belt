package main.java.MultiThreading;

public class Runnable2 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.run();

        for (int i = 1000; i>0;i--){
            System.out.println(i);
        }


    }
}
class MyThread5 implements Runnable{
    public void run(){
        for (int i = 1; i<1000;i++){
            System.out.println(i);
        }
    }
}

