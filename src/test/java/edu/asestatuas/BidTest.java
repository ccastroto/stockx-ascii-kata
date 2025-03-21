package edu.asestatuas;

import edu.asestatuas.stockx.item.Bid;
import org.junit.Test;
import static org.junit.Assert.*;

public class BidTest {

    @Test
    public void sizetest() {
        Bid bid = new Bid("13", 550);
        assertEquals("13", bid.size());
    }

    @Test
    public void bidtest() {
        Bid bid = new Bid("13", 550);
        assertEquals(550, bid.value());
    }

}
