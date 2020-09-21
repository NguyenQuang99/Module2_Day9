package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzBuzz1() {
        int number = 6;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz2() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz3() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz4() {
        int number = 8;
        String expected = String.valueOf(number);
        String result = FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);

    }


}