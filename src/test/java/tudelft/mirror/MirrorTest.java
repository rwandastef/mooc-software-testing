package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void testMirrorEnd1(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);

    }

    @Test
    public void testMirrorEnd2(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", result);

    }

    @Test
    public void testMirrorEnd3(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);

    }
}
