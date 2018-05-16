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
public class TemperaturaNoValidaExceptionTest {
    
    static ConversorTemperaturas conversor;
    
    public TemperaturaNoValidaExceptionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        conversor = new ConversorTemperaturas();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test (expected=TemperaturaNoValidaException.class)
    public void testSomeMethod()throws TemperaturaNoValidaException {
//        ConversorTemperaturas conversor = new ConversorTemperaturas();
        conversor.celsiusAFharenheit(-300);
        fail("Fallo en el manejo de la excepción TemperaturaNoValidaException");
    }
    
}
