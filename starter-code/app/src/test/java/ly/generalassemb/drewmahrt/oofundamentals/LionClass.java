package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * Created by wanmac on 7/13/16.
 */
public class LionClass {

    @Test
    public void lionTest() throws  Exception {
        String expectedNoise, actualNoise;
        int expedtedTopSpeed, actualTopSpeed;

        expectedNoise = "Roar!!!";
        Lion lion = new Lion();

        actualNoise = lion.makeNoise();

        expedtedTopSpeed = 50;
        actualTopSpeed = lion.getTopSpeed();

        assertEquals(expectedNoise, actualNoise);
        assertEquals(expedtedTopSpeed, actualTopSpeed);
    }

}
