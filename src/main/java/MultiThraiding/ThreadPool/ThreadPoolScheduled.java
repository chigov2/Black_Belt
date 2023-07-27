package main.java.MultiThraiding.ThreadPool;

public class ThreadPoolScheduled {
}


class RunnableImpl200 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {Thread.sleep(500);}
        catch (InterruptedException e) {e.printStackTrace();}
    }
}
