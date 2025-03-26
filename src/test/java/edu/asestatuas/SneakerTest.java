package edu.asestatuas;

import edu.asestatuas.stockx.item.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerTest {

    @Test
    public void getSneakerTest() {
        // ARRANGE  // APPLY
        Sneaker shoe = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        // TEST
        assertEquals("Jordan 1 Retro High Dark Mocha", shoe.getName());
    }

    @Test
    public void getStyleTest(){
        Sneaker shoe = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertEquals("555088-105", shoe.getStyle());
    }

    @Test
    public void constructorTest() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        assertNotNull(sneaker);
        assertEquals("555088-105", sneaker.getStyle());
        assertEquals("Jordan 1", sneaker.getName());
    }

    @Test
    public void addOfferBid() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Bid bid = new Bid("9.5", 282);
        sneaker.add(bid);
        assertEquals(1, sneaker.offers().size());
    }
    @Test
    public void addOfferAsk() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Ask ask = new Ask("15", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 340));
        sneaker.add(new Ask("13", 341));
        assertEquals(4, sneaker.offers().size());
    }

    @Test
    public void addOffer() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("9.5", 282));
        sneaker.add(new Ask("15", 288));
        Offer ask = new Ask("13", 333);
        sneaker.add(ask);
        assertEquals(3, sneaker.offers().size());
    }

}
