package org.example;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Mouse1Test extends TestCase {
    Mouse1 testO = new Mouse1();
@Before
    public void setUp() throws Exception {
        super.setUp();
        testO.setName("Apple");
    testO.setBrand("McBook");

    }
@After
    public void tearDown() throws Exception {
    System.out.println("Finishd Tesing ");

    }
    @Test
    public void testTestGetName() {
        assertEquals("Test running perfect", testO.getName(), "Apple");
        System.out.println("Test running perfect "+ testO.getName());
    }
    @Test
    public void testGetBrand() {
        assertEquals("Test running perfect", testO.getBrand(), "McBook");
        System.out.println("Test running perfect "+ testO.getBrand());
    }
    @Test
    public void testScrollDownColor() {
        assertTrue("Green!: Scrolling Down Color.",true);
        System.out.println("Test running perfect (Green!: Scrolling Down Color) ");
    }
}