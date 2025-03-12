package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.MainApp;

public class MainAppTest {
	MainApp map = new MainApp();
    @Test
    public void testAddition() {
        
        assertEquals("8 + 6 should be 14", 14, map.additon(8, 6));
    }

    @Test
    public void testMultiply() {
//        MainApp map = new MainApp();
        assertEquals("8 * 6 should be 48", 48, map.multiply(8, 6));
    }
}
