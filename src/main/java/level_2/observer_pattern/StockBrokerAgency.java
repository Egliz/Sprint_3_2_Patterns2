package level_2.observer_pattern;

public class StockBrokerAgency implements Observer {

    private String brokerAgency;

    public StockBrokerAgency(String brokerAgency) {
        this.brokerAgency = brokerAgency;
    }

    @Override
    public String notification(String message) {
        return brokerAgency + message;
    }
}
