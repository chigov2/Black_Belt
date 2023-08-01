package main.java.MultiThreading;

public class Runnable3 {
    public static void main(String[] args) {
        Thread thread6 = new Thread(new MyThread6());
        Thread thread7 = new Thread(new MyThread7());
        thread6.start();
        thread7.start();
    }


}

class MyThread6 implements Runnable{
    public void run(){
        for (int i = 1; i<1000;i++){
            System.out.println(i);
        }
    }
}

class MyThread7 implements Runnable{
    public void run(){
        for (int i = 1000; i>0;i--){
            System.out.println(i);
        }
    }
}

