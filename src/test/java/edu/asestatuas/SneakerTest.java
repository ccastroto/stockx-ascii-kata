package edu.asestatuas;

import edu.asestatuas.stockx.item.Sneaker;
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

}
