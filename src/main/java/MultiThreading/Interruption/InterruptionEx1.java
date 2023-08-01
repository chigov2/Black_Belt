package main.java.MultiThreading.Interruption;

public class InterruptionEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);//main thread sleep
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");

    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 0; i < 2000_000_000; i++){
            if (isInterrupted()){
                System.out.println("Поток хотят прервать");
                System.out.println("Мы убедились, что состояние всех пакетов нормальное и решили завершить работу потока");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {sleep(1000);}
            catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
