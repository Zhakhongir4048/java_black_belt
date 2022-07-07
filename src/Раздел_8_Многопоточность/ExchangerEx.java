package Раздел_8_Многопоточность;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.SCISSORS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SCISSORS);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.STONE);
        friend2Action.add(Action.STONE);

        new BestFriend("Zhakhongir", friend1Action, exchanger);
        new BestFriend("Dzhavid", friend2Action, exchanger);

    }

}

enum Action {
    STONE, SCISSORS, PAPER
}

class BestFriend extends Thread {

    private final String name;
    private final List<Action> myActions;
    private final Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if (myAction.equals(Action.STONE) && friendsAction.equals(Action.SCISSORS)
                || myAction.equals(Action.SCISSORS) && friendsAction.equals(Action.PAPER)
                || myAction.equals(Action.PAPER) && friendsAction.equals(Action.STONE)) {
            System.out.println(name + " WINS!!!");
        }

    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                // Получает ответ от другого потока
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
/*
Exchanger - это синхронизатор, позволяющий обмениваться данными между двумя потоками,
обеспечивает то, что оба потока получат информацию друг от друга одновременно.
Для обмена используется метод exchange()
Обмен информации происходит тогда, когда оба потока вызывают метод exchange()
*/