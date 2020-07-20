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
    public void noRepeat() {
        assertEquals("aei", StringUtils.vowels("aaaeeeiii"));
        assertEquals("aei", StringUtils.vowels("aeiaeiaei"));
        assertEquals("aei", StringUtils.vowels("aeeiai"));
    }

    @Test
    public void noRepeatIgnoreCase() {
        assertEquals("aei", StringUtils.vowels("aAeEiI"));
        assertEquals("aei", StringUtils.vowels("aeiAEIAEI"));
        assertEquals("aei", StringUtils.vowels("aeEiAI"));
        assertEquals("aeiouy", StringUtils.vowels("aeiouyAEIOUY"));
    }

    @Test
    public void noVowels() {
        assertEquals("", StringUtils.vowels("zrtpmk"));
    }
}
