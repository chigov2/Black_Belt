package main.java.MultiThreading.WaitNotify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
///////////////////////////////////////////////////////////////////////////////////////
class Market{
    private int breadCount = 0;
    private  final Object lock = new Object();

    //метод будет эмулировать взятие хлеба потребителем из магазина
    public void getBread(){
        synchronized (lock){
        while(breadCount < 1){
            try {lock.wait(500);}
            catch (InterruptedException e) {e.printStackTrace();}
        }
        breadCount--;
        System.out.println("Потребитель купил один хлеб");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        lock.notify();
        }
    }

    //метод будет выполняться производителем
    public void putBread(){
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //если хлеба на ветрине не 5, а меньше
            breadCount++;
            System.out.println("Производитель добавил на витрину 1 хлеб");
            System.out.println("Количество хлеба в магазине: " + breadCount);
            //должны известить потребителя, что хлеб добавился
            lock.notify();
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////
//создаем потоки производителя и потребителя
class Producer implements Runnable{
    Market market;

    //конструктор будет добавлять маркет производителю
    public Producer(Market market) {
    this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i <10; i++){
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;

    //конструктор будет добавлять маркет производителю
    public Consumer(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i <10; i++){
            market.getBread();
        }
    }
}
