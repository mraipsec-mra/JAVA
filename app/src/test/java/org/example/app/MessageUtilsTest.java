package org.example.app;

import org.junit.jupiter.api.Test;
import org.primaryprograms.app.MessageUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageUtilsTest {
    @Test void testGetMessage() {
        assertEquals("Hello      World!", MessageUtils.getMessage());
    }
}
