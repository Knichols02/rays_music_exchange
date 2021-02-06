import Behaviours.ISell;
import ShopStock.Headphones;
import ShopStock.Instrument;
import ShopStock.Piano;
import ShopStock.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop raysMusicExchange;
    Headphones headphones;
    Trumpet trumpet;
    Piano piano;

    @Before
    public void before(){
        raysMusicExchange = new Shop();
        headphones = new Headphones("Beats", 80, 150, 10, 25 );
        piano = new Piano("Kawai Digital Piano", 1000, 1200,
                "Satin Black", "Piano sounds great!");
    }

    @Test
    public void canCreateShop(){
        assertNotNull(raysMusicExchange);
    }

    @Test
    public void canCheckShopStartsEmpty(){
        assertEquals(0, raysMusicExchange.countStock());
    }

    @Test
    public void canAddItemToShop(){
        raysMusicExchange.addStockItem(headphones);
        assertEquals(1, raysMusicExchange.countStock());
    }

    @Test
    public void canSellItem(){
        raysMusicExchange.addStockItem(headphones);
        raysMusicExchange.addStockItem(headphones);
        raysMusicExchange.addStockItem(headphones);
        raysMusicExchange.removeStockItem(headphones);
        assertEquals(2, raysMusicExchange.countStock());
    }

    @Test
    public void canAddInstrumentToStock(){
        raysMusicExchange.addStockItem(piano);
        raysMusicExchange.addStockItem(trumpet);
        assertEquals(2, raysMusicExchange.countStock());
    }

    @Test
    public void canSellInstrument(){
        raysMusicExchange.addStockItem(trumpet);
        raysMusicExchange.removeStockItem(trumpet);
        assertEquals(0, raysMusicExchange.countStock());
    }
}
