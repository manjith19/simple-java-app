package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void greetReturnsExpectedMessage() {
        App app = new App();
        assertEquals("first java project", app.greet());
    }
}
