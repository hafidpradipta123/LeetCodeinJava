package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.EncodeDecodeTinyURL535;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodeDecodeTinyURL535Test {
    private EncodeDecodeTinyURL535 urlED;
    @BeforeEach
    public void setUp(){
        urlED = new EncodeDecodeTinyURL535();

    }

    @Test
    void encode() {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String encodeUrl = urlED.encode(longUrl);
        String decodeUrl = urlED.decode(encodeUrl);

        assertEquals(longUrl, decodeUrl);

    }

    @Test
    void duplicate() {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String encodedUrl1 = urlED.encode(longUrl);
        String encodedUrl2 = urlED.encode(longUrl);
        assertEquals(encodedUrl2, encodedUrl1);

    }
}