package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Test Hello World
     */
    @Test
    public void testHelloWorld()
    {
        App app = new App();
        String test = app.helloWorld();

        assertEquals("Hello World !", test);
    }

    
}
