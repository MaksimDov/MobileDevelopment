package com.maksim.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MinMaxClass t = new MinMaxClass();

        assertEquals(t.min(1941,1945), 1941);
        assertEquals(t.min(1917,1914), 1914);
        assertEquals(t.min(1812,1812), 1812);
        assertEquals(t.min(-456,456), -456);

        assertEquals(t.max(1941,1945), 1945);
        assertEquals(t.max(1917,1914), 1917);
        assertEquals(t.max(1812,1812), 1812);
        assertEquals(t.max(-456,456), 456);

        assertEquals(4, 2 + 2);
    }
}