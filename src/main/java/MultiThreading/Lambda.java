package main.java.MultiThreading;

public class Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<1000;i++){
                    System.out.println(i);
                }
            }
        }).start();

        /////////////////////////////////////
        new Thread(()->System.out.println("poka--------------------------------")).start();
    }
}
