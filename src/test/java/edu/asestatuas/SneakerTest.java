package edu.asestatuas;

import edu.asestatuas.stockx.item.Sneaker;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerTest {

    @Test
    public void getSneakerTest() {
        // ARRANGE  // APPLY
        Sneaker shoe = new Sneaker("Jordan");

        // TEST
        assertEquals("Jordan", shoe.getName());
    }

}
