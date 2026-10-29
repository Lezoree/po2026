package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void sleepIn() {
        assertEquals(true, codingBat.sleepIn(false, false));
        assertEquals(false, codingBat.sleepIn(true, false));
        assertEquals(true, codingBat.sleepIn(false, true));
    }

    @org.junit.Test
    public void intMax() {
        assertEquals(3, codingBat.intMax(1, 2, 3));
        assertEquals(3, codingBat.intMax(1, 3, 2));
        assertEquals(3, codingBat.intMax(3, 2, 1));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(3, codingBat.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, codingBat.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, codingBat.countEvens(new int[]{1, 3, 5}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello X!", codingBat.helloName("X"));
    }
}