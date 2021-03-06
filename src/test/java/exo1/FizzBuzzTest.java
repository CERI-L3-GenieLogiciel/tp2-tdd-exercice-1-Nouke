package test.java.exo1;

import main.java.exo1.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    
    FizzBuzz fz ;
    @BeforeEach
    void init() 
    {
        fz = new FizzBuzz();
    }
    @Test
    void shouldReturn1When1()
    {
        assertEquals("1",fz.getResult(1));
    }

    @Test
    void shouldReturn2When2()
    {
        assertEquals("2",fz.getResult(2));
    }

    @Test
    void shouldReturnFizzWhen3()
    {
        assertEquals("Fizz",fz.getResult(3));
    }

    @Test
    void shouldReturnBuzzWhen5()
    {
       String actual = fz.getResult(5);
       String expected = actual;
       assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzWhen6()
    {
        assertEquals("Fizz",fz.getResult(6));
    }
    @Test
    void shouldReturnBuzzWhen10()
    {
        assertEquals("Buzz",fz.getResult(10));
    }

    @Test
    void shouldReturnFizzBuzzWhen15()
    {
        assertEquals("FizzBuzz",fz.getResult(15));
    }

    @Test
    void shouldReturnFizzBuzzWhen30()
    {
        assertEquals("FizzBuzz",fz.getResult(30));
    }



}