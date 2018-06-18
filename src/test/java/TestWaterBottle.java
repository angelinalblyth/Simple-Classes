import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {



    @Test
    public void volume(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(100, waterbottle.amount());
    }

    @Test
    public void newVolume(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyBottle(){
        WaterBottle waterbottle = new WaterBottle(60);
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void fillBottle(){
        WaterBottle waterbottle = new WaterBottle(90);
        assertEquals(100, waterbottle.fill());
    }
}
