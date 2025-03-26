package edu.asestatuas.item;

import edu.asestatuas.stockx.item.*;
import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;

public class AskTest {

    @Test
    public void SizeAskTest(){
        Ask ask = new Ask("13", 288);
        assertEquals("13", ask.size());
        assertEquals(Optional.of(288), Optional.ofNullable(ask.ask()));
    }

    @Test
    public void ValueTest(){
        Ask ask = new Ask("13", 288);
        assertNotNull(String.valueOf(288), ask.ask());
    }

    @Test
    public  void toStringTest(){
        Ask ask = new Ask("13", 288);
        assertNotNull(String.valueOf(ask), ask.toString());
        assertNotNull(ask.toString());
    }
}
