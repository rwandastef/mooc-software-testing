package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void ghappyTest1(){
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }


    @Test
    public void ghappyTest2(){
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("agsg");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void ghappyTest3(){
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("gxxggyygxx");
        Assertions.assertFalse(result);
    }
}
