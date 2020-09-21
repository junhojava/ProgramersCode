package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StockTest {
    Stock stock = new Stock();

    @Test
    void testIsBigger()
    {
        assertTrue(stock.isBigger(2,1));
    }
}