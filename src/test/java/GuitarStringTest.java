import ShopStock.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Ernie Ball", 6, 15, 30, "E" );
    }

    @Test
    public void hasGuitarString(){
        assertEquals("Ernie Ball", guitarString.getItemType());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(6, guitarString.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(15, guitarString.getSalePrice() , 0.0);
    }

    @Test
    public void hasQuantity(){
        assertEquals(30, guitarString.getQuantity());
    }

    @Test
    public void getGaugeSize(){
        assertEquals("E", guitarString.getGauge());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(150, guitarString.calculateMarkup(), 0.0);
    }
}
