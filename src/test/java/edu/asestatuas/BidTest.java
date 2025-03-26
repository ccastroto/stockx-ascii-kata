package edu.asestatuas;

import edu.asestatuas.stockx.item.Bid;
import org.junit.Test;
import static org.junit.Assert.*;

public class BidTest {

    @Test
    public void sizeTest() {
        Bid bid = new Bid("13", 550);
        assertEquals("13", bid.size());
    }

    @Test
    public void bidTest() {
        Bid bid = new Bid("13", 550);
        assertEquals(550, bid.value());
    }

    @Test
    public void toStringTest() {
        Bid bid = new Bid("13", 550);
        assertNotNull(String.valueOf(bid), bid.toString());
        assertNotNull(bid.toString());
    }

}
