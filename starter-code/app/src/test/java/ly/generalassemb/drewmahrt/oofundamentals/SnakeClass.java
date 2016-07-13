package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by wanmac on 7/13/16.
 */
public class SnakeClass {
    @Test
    public void snakeTest() throws  Exception {
        String expectedNoise, actualNoise;
        int expedtedTopSpeed, actualTopSpeed;

        Snake snake = new Snake(true);
        expedtedTopSpeed = 5;
        actualTopSpeed = snake.getTopSpeed();

        expectedNoise = "Hiss!!!";
        actualNoise = snake.makeNoise();

        assertEquals(expectedNoise, actualNoise);
        assertEquals(expedtedTopSpeed, actualTopSpeed);
    }
}
