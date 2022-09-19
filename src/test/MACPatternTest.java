package test;

import Regexp.Regexp;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MACPatternTest {
    @Test
    public void firstFalse() {
        assertFalse(Regexp.MAC(""));
    }
    @Test
    public void secondFalse() {
        assertFalse(Regexp.MAC("01:23:45:67:89:Az"));
    }
    @Test
    public void thirdFalse() {
        assertFalse(Regexp.MAC("5a:8a:60:f7:fH:05"));
    }
    @Test
    public void fourthFalse() {
        assertFalse(Regexp.MAC("c1:e8:82:12f:4c:c5"));
    }
    @Test
    public void fifthFalse() {
        assertFalse(Regexp.MAC("fN:51:e9:ac:0e:e6"));
    }
    @Test
    public void sixthFalse() {
        assertFalse(Regexp.MAC("a7:c10:43:a3:3b:80"));
    }

    @Test
    public void firstTrue() {
        assertTrue(Regexp.MAC("aE:dC:cA:56:76:54"));
    }
    @Test
    public void secondTrue() {
        assertTrue(Regexp.MAC("aE-dC-cA-56-76-54"));
    }
    @Test
    public void thirdTrue() {
        assertTrue(Regexp.MAC("bd:b2:b5:6e:54:79"));
    }
    @Test
    public void fourthTrue() {
        assertTrue(Regexp.MAC("b4:b4:24:d1:91:8e"));
    }
    @Test
    public void fifthTrue() {
        assertTrue(Regexp.MAC("f9:90:8c:40:77:c7"));
    }
    @Test
    public void sixthTrue() {
        assertTrue(Regexp.MAC("a7:91:15:2f:31:f5"));
    }
}
