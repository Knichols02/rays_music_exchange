import ShopStock.Headphones;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadphonesTest {

    Headphones headphones;

    @Before
    public void before(){
        headphones = new Headphones("Beats", 80, 150,
                10, 25 );
    }

    @Test
    public void hasHeadphones(){
        assertEquals("Beats", headphones.getItemType());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(80, headphones.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(150, headphones.getSalePrice() , 0.0);
    }

    @Test
    public void getGaugeSize(){
        assertEquals(10, headphones.getQuantity());
    }

    @Test
    public void hasImpedanceLevel(){
        assertEquals(25, headphones.getImpedanceLevel());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(87.5, headphones.calculateMarkup(), 0.0);
    }
}
