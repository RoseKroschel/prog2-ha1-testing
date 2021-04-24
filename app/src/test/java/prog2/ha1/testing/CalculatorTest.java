package prog2.ha1.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
/*
    @Test
    @DisplayName("should display correct number after pressing digit keys")
    void testDigitInput() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressDigitKey(2);

        String expected = "42";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after adding two positive numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "4";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //TODO hier weitere Tests erstellen

    //1. Grün
    @Test
    @DisplayName("Should display a dotted number.")
    void testDotKey(){
    Calculator calc = new Calculator();

        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(1);

    String expected = "1.1";
    String actual = calc.readScreen();

    assertEquals(expected, actual);
}

    @Test
    @DisplayName("should display a negative digit")
    void testNegativeDigit() {
    Calculator calc = new Calculator();
        calc.pressNegativeKey();
        calc.pressDigitKey(2);
        assertEquals("-2", calc.readScreen());
}
*/
    @Test
    @DisplayName("should display a double result")
    void testDoubleResult(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(1);
        assertEquals("1.1", calc.readScreen());

        calc.pressBinaryOperationKey("+");

        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(6);
        assertEquals("2.6", calc.readScreen());
        calc.pressEqualsKey();
        String expected = "3.7";
        String actual = calc.readScreen();
        assertEquals(expected,actual);


    }

}

