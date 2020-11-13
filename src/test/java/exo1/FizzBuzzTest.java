package test.java.exo1;

import main.java.exo1.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz f = new FizzBuzz();
    @Test
    void shouldReturn1When1()
    {
        assertEquals("1",f.getResult(1));
    }


}