package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wanmac on 7/13/16.
 */
public class ZooTest {

    @Test
    public void zooTest() throws Exception {
        Zoo zooOne = Zoo.getInstance();
        Lion lion = new Lion();

        zooOne.addAnimal(lion);

        int aaa = zooOne.getAnimals().size();

        assertEquals(aaa, 1);
        //assertTrue(true);

    }
}
//    public Animal(int topSpeed, boolean isEndangered, String name){
//        this.mTopSpeed = topSpeed;
//        this.mIsEndangered = isEndangered;
//        this.mName = name;
//    }