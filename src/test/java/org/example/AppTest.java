package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testVowels() {
        assertEquals("aeiouyAEIOUY", StringUtils.vowels("aeiouyAEIOUY"));
        assertEquals("oa", StringUtils.vowels("Morgan"));
    }

    @Test
    public void noRepeat() {
        assertEquals("aei", StringUtils.uniqueVowels("aaaeeeiii"));
        assertEquals("aei", StringUtils.uniqueVowels("aeiaeiaei"));
        assertEquals("aei", StringUtils.uniqueVowels("aeeiai"));
    }

    @Test
    public void noVowels() {
        assertEquals("", StringUtils.vowels("zrtpmk"));
        assertEquals("", StringUtils.uniqueVowels("zrtpmk"));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNull() {
        StringUtils.vowels(null);
        StringUtils.uniqueVowels(null);
    }
}
