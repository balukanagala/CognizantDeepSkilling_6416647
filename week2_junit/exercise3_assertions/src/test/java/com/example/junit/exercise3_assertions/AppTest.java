package com.example.junit.exercise3_assertions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue; // Or org.junit.jupiter.api.Assertions.*;

public class AppTest { // No longer extends TestCase

    @Test // Use @Test annotation
    void testApp() { // Modern method naming convention, can be public void or just void
        assertTrue(true); // Use JUnit 5 Assertions
    }
}