import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Lab12Test {
    @Disabled
    @Test
    void calculate() throws SyntaxError {
        Assertions.assertEquals("(1+2) = 3", Lab12.Calculate("1+2"));
        Assertions.assertEquals("(20-3) = 17", Lab12.Calculate("20-3"));
        Assertions.assertEquals("(12*3) = 36", Lab12.Calculate("12*3"));
        Assertions.assertEquals("(9/3) = 3", Lab12.Calculate("9/3"));
        Assertions.assertEquals("(5%3) = 2", Lab12.Calculate("5%3"));
        Assertions.assertEquals("((5%3)*18) = 36", Lab12.Calculate("(5%3)*18"));
        Assertions.assertEquals("(20-40) = -20", Lab12.Calculate("20-40"));
        Assertions.assertEquals("(20-(40*5)) = -180", Lab12.Calculate("20-40*5"));
        Throwable exception =  Assertions.assertThrows(Exception.class, () -> Lab12.Calculate("1/0"));
        Assertions.assertEquals("Syntaxerror", exception.getMessage());
        Throwable exception1 =  Assertions.assertThrows(Exception.class, () -> Lab12.Calculate("z%k"));
        Assertions.assertEquals("Syntaxerror", exception1.getMessage());
        Throwable exception2 =  Assertions.assertThrows(Exception.class, () -> Lab12.Calculate("1 2 +"));
       Assertions.assertEquals("Syntaxerror", exception2.getMessage());
        Throwable exception3 =  Assertions.assertThrows(Exception.class, () -> Lab12.Calculate("1+a"));
        Assertions.assertEquals("Syntaxerror", exception3.getMessage());
        Throwable exception4 =  Assertions.assertThrows(Exception.class, () -> Lab12.Calculate("19+2.0"));
        Assertions.assertEquals("Syntaxerror", exception4.getMessage());

    }
}