package agh.po.lab3;

import static org.junit.Assert.*;
import  java.util.Map;
import java.util.HashMap;

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

    @org.junit.Test
    public void mapAB4(){
        Map<String, String> map1 = new HashMap<String, String>(Map.of("a", "aaa", "b", "bb", "c", "cake"));
        assertEquals("aaa", codingBat.mapAB4(map1).get("c"));
        Map<String, String> map2 = new HashMap<String, String>(Map.of("a", "aa", "b", "bbb", "c", "cake"));
        assertEquals("bbb", codingBat.mapAB4(map2).get("c"));
        Map<String, String> map3 = new HashMap<String, String>(Map.of("a", "aa", "b", "bb"));
        codingBat.mapAB4(map3);
        assertEquals("", map3.get("a"));
        assertEquals("", map3.get("b"));
    }

    @org.junit.Test
    public void pairs(){
        assertEquals(
                Map.of("b", "g", "c", "e"), codingBat.pairs(new String[]{"code", "bug"})
        );
        assertEquals(
                Map.of("m", "n"), codingBat.pairs(new String[]{"man", "moon", "main"})
        );
        assertEquals(
                Map.of("g", "d", "m", "n", "n", "t"),
                codingBat.pairs(new String[]{"man", "moon", "good", "night"})
        );
    }


}