import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop raysMusicExchange;

    @Before
    public void before(){
        raysMusicExchange = new Shop();
    }

    @Test
    public void canCreateShop(){
        assertNotNull(raysMusicExchange);
    }

}
