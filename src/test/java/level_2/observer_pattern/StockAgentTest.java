package level_2.observer_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StockAgentTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private StockAgent agent;
    private Observer alpha;
    private Observer zenith;

    @BeforeEach
    void setUp() {
        agent = new StockAgent();
        alpha = new StockBrokerAgency("Alpha Brokers");
        zenith = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alpha);
        agent.addObserver(zenith);

        output.reset();
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void shouldNotifyAllObserversWhenStockMarketUp() {
        agent.stockMarketUp(150.75);

        String result = output.toString();

        assertTrue(result.contains("Alpha Brokers received notification: Stock market went UP to 150.75"));
        assertTrue(result.contains("Zenith Investments received notification: Stock market went UP to 150.75"));
    }


    @Test
    void shouldNotifyAllObserversWhenStockMarketDown() {
        agent.stockMarketDown(145.50);

        String result = output.toString();

        assertTrue(result.contains("Alpha Brokers received notification: Stock market went DOWN to 145.5"));
        assertTrue(result.contains("Zenith Investments received notification: Stock market went DOWN to 145.5"));
    }

    @Test
    void shouldNotNotifyRemovedObserver() {
        agent.removeObserver(zenith);

        agent.stockMarketUp(150.75);

        String result = output.toString();

        assertTrue(result.contains("Alpha Brokers"));
        assertFalse(result.contains("Zenith Investments"));
    }
}
