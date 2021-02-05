import ShopStock.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before

    public void before(){
        guitar = new Guitar("Acoustic Guitar",1200, 1500, "Red", 6 );
    }

    @Test
    public void hasItemType(){
        assertEquals("Acoustic Guitar", guitar.getItemType());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(1200, guitar.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(1500, guitar.getSalePrice() , 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void getNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }
}
