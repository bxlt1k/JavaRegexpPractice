package test;

import Regexp.Regexp;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordPatternTest {
    @Test
    public void emptyPasswordTest() {
        assertFalse(Regexp.password(""));
    }
    @Test
    public void noDigitsPasswordTest() {
        assertFalse(Regexp.password("Cool_pass"));
    }
    @Test
    public void noUpperCaseLettersPasswordTest() {
        assertFalse(Regexp.password("coo1_pass"));
    }
    @Test
    public void noLowerCaseLettersPasswordTest() {
        assertFalse(Regexp.password("COO1_PASS"));
    }
    @Test
    public void RussianLettersPasswordTest() {
        assertFalse(Regexp.password("Кул1"));
    }
    @Test
    public void wrongSymbolsPasswordTest() {
        assertFalse(Regexp.password("Coo1*pass"));
    }

    @Test
    public void firstTrue() {
        assertTrue(Regexp.password("SupperPas1"));
    }
    @Test
    public void secondTrue() {
        assertTrue(Regexp.password("C00l_Pass"));
    }
    @Test
    public void thirdTrue() {
        assertTrue(Regexp.password("AaBb123aAbB"));
    }
    @Test
    public void fourthTrue() {
        assertTrue(Regexp.password("First13asd"));
    }
    @Test
    public void fifthTrue() {
        assertTrue(Regexp.password("zxcXZZCS1sd"));
    }
    @Test
    public void sixthTrue() {
        assertTrue(Regexp.password("ASDAWDASD2d"));
    }
}
