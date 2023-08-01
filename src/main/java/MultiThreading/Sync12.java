package main.java.MultiThreading;

public class Sync12 {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Mobile());
        Thread thread2 = new Thread(new Skype());
        Thread thread3 = new Thread(new WhatsUp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
        void mobileCall() {
        synchronized (lock){
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mobile call ends");}
    }
    void skypeCall() {
        synchronized (lock) {
//            System.out.println(this);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }
    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ends");
        }
    }
}
class Mobile implements Runnable {
    @Override
    public void run() {new Sync12().mobileCall();}
}
class Skype implements Runnable {
    @Override
    public void run() { new Sync12().skypeCall();}
}
class WhatsUp implements Runnable {
    @Override
    public void run() {new Sync12().whatsAppCall();}
}
