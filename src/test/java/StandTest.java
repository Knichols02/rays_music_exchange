import ShopStock.Stand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandTest {

    Stand stand;

    @Before
    public void before(){
    stand =new Stand("Music Stand",10,20, 3);
}

    @Test
    public void hasStand(){
        assertEquals("Music Stand", stand.getItemType());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(10, stand.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(20, stand.getSalePrice() , 0.0);
    }
}
