import ShopStock.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before

    public void before(){
        trumpet = new Trumpet("Swanky pTrumpet", 50, 100, "Purple", 4);
    }

    @Test
    public void hasItemType(){
        assertEquals("Swanky pTrumpet", trumpet.getItemType());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(50, trumpet.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(100, trumpet.getSalePrice() , 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("Purple", trumpet.getColour());
    }

    @Test
    public void getNoOfValves(){
        assertEquals(4, trumpet.getNoOfValves());
    }

    @Test
    public void canPlayTrumpet(){
        assertEquals("High pitched Trumpity Sounds", trumpet.canPlay());
    }
}
