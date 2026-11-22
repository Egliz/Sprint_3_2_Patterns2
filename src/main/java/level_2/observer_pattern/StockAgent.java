package level_2.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private double value;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void stockMarketUp(double value){
        this.value = value;
        for(Observer ob : observers) {
            System.out.println(ob.notification(" received notification: Stock market went UP to " + value));
        }
    }

    public void stockMarketDown(double value){
        this.value = value;
        for(Observer ob : observers) {
            System.out.println(ob.notification(" received notification: Stock market went DOWN to " + value));
        }
    }
}
