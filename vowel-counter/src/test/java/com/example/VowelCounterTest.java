package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {

    private final VowelCounter vowelcounter = new VowelCounter();

    @Test
    void Word() {
        String word = "paralelepipedo";

        int result = vowelcounter.counter(word);

        assertEquals(7, result);
    }

    @Test
    void NotWord() {
        String notword = "122351";

        int result = vowelcounter.counter(notword);

        assertEquals(0, result);
    }
    
    @Test
    void Null() {
        String notword = null;

        assertThrows(IllegalArgumentException.class, () -> {
        	vowelcounter.counter(notword);
        });
    }
}
