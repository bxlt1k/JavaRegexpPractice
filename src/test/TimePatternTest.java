package test;

import Regexp.Regexp;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TimePatternTest {
    @Test
    public void emptyTimeTest() {
        assertFalse(Regexp.time("hello world"));
    }
    @Test
    public void moreHoursTest() {
        assertFalse(Regexp.time("hello 25:15 world"));
    }
    @Test
    public void moreMinuteTest() {
        assertFalse(Regexp.time("hello 14:62 world"));
    }
    @Test
    public void timeLimitTest() {
        assertFalse(Regexp.time("hello 24:00 world"));
    }
    @Test
    public void oneDigitInHoursTest() {
        assertFalse(Regexp.time("hello 4:20 world"));
    }
    @Test
    public void oneDigitInMinuteTest() {
        assertFalse(Regexp.time("hello 17:5 world"));
    }

    @Test
    public void first() {
        assertTrue(Regexp.time("hello 17:50 world"));
    }
    @Test
    public void second() {
        assertTrue(Regexp.time("hello 23:59 world"));
    }
    @Test
    public void third() {
        assertTrue(Regexp.time("07:12 hello world"));
    }
    @Test
    public void fourth() {
        assertTrue(Regexp.time("hello world 16:59"));
    }
    @Test
    public void fifth() {
        assertTrue(Regexp.time("hello 12:30 world"));
    }
    @Test
    public void sixth() {
        assertTrue(Regexp.time("hello :17:50: world"));
    }
}
