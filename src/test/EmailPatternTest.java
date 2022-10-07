package test;

import Regexp.Regexp;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailPatternTest {
    @Test
    public void firstFalse() {
        assertFalse(Regexp.email(""));
    }
    @Test
    public void secondFalse() {
        assertFalse(Regexp.email("bug@@@com.ru"));
    }
    @Test
    public void thirdFalse() {
        assertFalse(Regexp.email("@val.ru"));
    }
    @Test
    public void fourthFalse() {
        assertFalse(Regexp.email(".@somewhere.com"));
    }
    @Test
    public void fifthFalse() {
        assertFalse(Regexp.email("bug@@@com.ru.com"));
    }
    @Test
    public void sixthFalse() {
        assertFalse(Regexp.email("bug@mail.ru@@com.ru.com"));
    }

    @Test
    public void firstTrue() {
        assertTrue(Regexp.email("user@example.com"));
    }
    @Test
    public void secondTrue() {
        assertTrue(Regexp.email("root@localhost"));
    }
    @Test
    public void thirdTrue() {
        assertTrue(Regexp.email("customer/department=shipping@example.com"));
    }
    @Test
    public void fourthTrue() {
        assertTrue(Regexp.email("_somename@example.com"));
    }
    @Test
    public void fifthTrue() {
        assertTrue(Regexp.email("john@192.168.1.10"));
    }
    @Test
    public void sixthTrue() {
        assertTrue(Regexp.email("john.foo+label@somewhere.com"));
    }
}
