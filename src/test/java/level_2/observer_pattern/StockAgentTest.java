package level_2.observer_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StockAgentTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void shouldNotifyAllObserversWhenStockMarketUp() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        agent.stockMarketUp(150.75);

        String result = output.toString();

        assertTrue(result.contains("Alpha Brokers received notification: Stock market went UP to 150.75"));

        assertTrue(result.contains("Zenith Investments received notification: Stock market went UP to 150.75"));
    }


    @Test
    void shouldNotifyAllObserversWhenStockMarketDown() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        agent.stockMarketDown(145.50);

        String result = output.toString();

        assertTrue(result.contains("Alpha Brokers received notification: Stock market went DOWN to 145.5"));

        assertTrue(result.contains("Zenith Investments received notification: Stock market went DOWN to 145.5"));
    }
}
