import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lab10Test {
    @Test
    void TestCalculate() throws Exception {
        assertEquals("1+2 = 3",Lab10.Calculate("1+2"));
        assertEquals("3-3 = 0",Lab10.Calculate("3-3"));
        assertEquals("3*3 = 9",Lab10.Calculate("3*3"));
        assertEquals("9/3 = 3",Lab10.Calculate("9/3"));
        assertEquals("5%3 = 2",Lab10.Calculate("5%3"));
        assertEquals(Lab10.Calculate("1+a"),"Throw exception");
        assertEquals(Lab10.Calculate("3-b"),"Throw exception");
        assertEquals(Lab10.Calculate("3*c"),"Throw exception");
        assertEquals(Lab10.Calculate("9/d"),"Throw exception");
        assertEquals(Lab10.Calculate("5%a"),"Throw exception");
        assertEquals(Lab10.Calculate("1+2.5"),"Throw exception");
        assertEquals(Lab10.Calculate("3-4.0"),"Throw exception");
        assertEquals(Lab10.Calculate("3*5.3"),"Throw exception");
        assertEquals(Lab10.Calculate("9/2.0"),"Throw exception");
        assertEquals(Lab10.Calculate("5%3.0"),"Throw exception");

    }




}