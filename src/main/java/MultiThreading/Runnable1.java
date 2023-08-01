package main.java.MultiThreading;
public class Runnable1 {
    public static void main(String[] args) {
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        thread3.run();
        thread4.run();

    }


}
class MyThread3 implements Runnable{
    public void run(){
        for (int i = 1; i<1000;i++){
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable{
    public void run(){
        for (int i = 1000; i>0;i--){
            System.out.println(i);
        }
    }
}
