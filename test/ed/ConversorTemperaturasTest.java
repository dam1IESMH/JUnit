/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LBB
 */
public class ConversorTemperaturasTest {
    
    private static ConversorTemperaturas instance;
    
    public ConversorTemperaturasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ConversorTemperaturas();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of celsiusAFharenheit method, of class ConversorTemperaturas.
     * @throws Exception
     */
    @Test 
    public void testCelsiusAFharenheit() throws Exception {
        System.out.println("celsiusAFharenheit");
        double celsius = 0.0;
        double expResult = 32.0;
        double result = instance.celsiusAFharenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of fharenheitACelsius method, of class ConversorTemperaturas.
     */
    @Test 
    public void testFharenheitACelsius() {
        System.out.println("fharenheitACelsius");
        double fahrenheit = 50.0;
        double expResult = 10.0;
        double result = instance.fharenheitACelsius(fahrenheit);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of celsiusAReamur method, of class ConversorTemperaturas.
     * @throws Exception
     */
    @Test 
    public void testCelsiusAReamur() throws Exception {
        System.out.println("celsiusAReamur");
        double celsius = 0.0;
        double expResult = 0.0;
        double result = instance.celsiusAReamur(celsius);
        assertEquals(expResult, result, 0.0);
    }
    
}
