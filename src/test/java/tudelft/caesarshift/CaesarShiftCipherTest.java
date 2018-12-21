package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void testZeroShift(){
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("hallo", 0);
        Assertions.assertEquals(" blabla", result );

        // result: hij append eerst de current karakter, dus krijg je een verdubbeling

    }

}
