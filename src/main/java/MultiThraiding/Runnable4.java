package main.java.MultiThraiding;

public class Runnable4 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<1000;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread8 = new Thread(new Runnable4());
        thread8.start();

        for (int i = 1000; i>0;i--){
            System.out.println(i);
        }
    }
}
