import ShopStock.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopItemTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Acoustic Guitar",1200, 1500,
                "Red", 6 );
    }

    @Test
    public void canCalculateGuitarMarkup(){
        assertEquals(25, guitar.calculateMarkup(), 0.0);
    }
}

