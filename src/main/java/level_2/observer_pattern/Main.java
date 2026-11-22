package level_2.observer_pattern;

public class Main {
    public static void main(String[] args) {

        StockBrokerAgency stockBrokerAgency1 = new StockBrokerAgency("Agency 1");
        StockBrokerAgency stockBrokerAgency2 = new StockBrokerAgency("Agency2");

        StockAgent stockAgent = new StockAgent();

        stockAgent.addObserver(stockBrokerAgency1);
        stockAgent.addObserver(stockBrokerAgency2);

        stockAgent.stockMarketDown(6);
        stockAgent.stockMarketUp(78.9);

        stockAgent.removeObserver(stockBrokerAgency1);

        stockAgent.stockMarketDown(9);
        stockAgent.stockMarketUp(79);
    }
}
