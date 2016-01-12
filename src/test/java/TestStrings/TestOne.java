package TestStrings;

import Strings.One;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class TestOne {

    private One o;

    @Before
    public void setUp(){
        o = new One();
        o.setStep(2);
        o.setSymbol("*");
        o.setTheString("123456");

    }

    @Test
   public void testChangeString(){
        System.out.println("step "+o.getStep()+"\n Symbol is "+o.getSymbol()+"\n the string is "+ o.getTheString());

        assertEquals("Expected 1*3*5* ","1*3*5*", o.changeString());
    }

}
