import ShopStock.Guitar;
import ShopStock.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PianoTest {

    Piano piano;

    @Before

    public void before(){
        piano = new Piano("Kawai Digital Piano", 1000, 1200, "Satin Black", "Piano sounds great!");
    }

    @Test
    public void hasPiano(){
        assertEquals("Kawai Digital Piano", piano.getItemType());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(1000, piano.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(1200, piano.getSalePrice() , 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("Satin Black", piano.getColour());
    }

    @Test
    public void pianoIsTuned(){
        assertEquals("Piano sounds perfect!", piano.isTuned());
    }

    @Test
    public void pianoNeedsTuned(){
        assertEquals("Piano sounds awful!", piano.needsTuned());
    }

    @Test
    public void canPlayPiano(){
        assertEquals("Chime, plink, dunnnn", piano.canPlay());
    }

    @Test
    public void canCalculatePianoMarkup(){
        assertEquals(20, piano.calculateMarkup(), 0.0);
    }
}
