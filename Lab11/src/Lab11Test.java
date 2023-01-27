 import org.junit.jupiter.api.Disabled;
 import org.junit.jupiter.api.Test;

 import static org.junit.jupiter.api.Assertions.*;


 class Lab11Test {
     @Test
     void calculate() throws SyntaxError {
         assertEquals("1+2 = 3",Lab11.Calculate("1+2"));
         assertEquals("3-3 = 0",Lab11.Calculate("3-3"));
         assertEquals("3*3 = 9",Lab11.Calculate("3*3"));
         assertEquals("9/3 = 3",Lab11.Calculate("9/3"));
         assertEquals("5%3 = 2",Lab11.Calculate("5%3"));
         assertEquals(Lab11.Calculate("4 - ( 1 - 5 )"),"4 - ( 1 - 5 ) = 8");
         assertEquals(Lab11.Calculate("0 * ( 8 * 0 )"),"0 * ( 8 * 0 ) = 0");
         assertEquals(Lab11.Calculate("1+a"),"SyntaxError");
         assertEquals(Lab11.Calculate("9/2.0"),"SyntaxError");
         assertEquals(Lab11.Calculate("5%3.0"),"SyntaxError");
     }
 }