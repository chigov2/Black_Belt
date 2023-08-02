package main.java.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx1 {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOZHNIZI);
        friend1Action.add(Action.KAMEN);
        friend1Action.add(Action.BUMAGA);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Max",friend1Action,exchanger);
        new BestFriend("Alex",friend2Action,exchanger);
    }
}
enum Action{
    KAMEN, NOZHNIZI, BUMAGA
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action friendAction){
        if (myAction == Action.KAMEN && friendAction == Action.NOZHNIZI
                || myAction == Action.NOZHNIZI && friendAction == Action.BUMAGA
                || myAction == Action.BUMAGA && friendAction == Action.KAMEN
        ){
            System.out.println(name + " wins");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myAction){
            try {reply = exchanger.exchange(action);
            whoWins(action,reply);
            sleep(2000);}
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

