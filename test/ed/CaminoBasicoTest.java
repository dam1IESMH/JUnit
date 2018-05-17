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
public class CaminoBasicoTest {
    
    public CaminoBasicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test1 of aMethod method, of class CaminoBasico.
     */
    @Test
    public void testAMethod1() {
        System.out.println("Camino 1-> a=true, b=false, c=true : ret=2");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        CaminoBasico instance = new CaminoBasico();
        int expResult = 2;
        int result = instance.aMethod(a, b, c);
        assertEquals(expResult, result);
    }
    
    /**
     * Test2 of aMethod method, of class CaminoBasico.
     */
    @Test
    public void testAMethod2() {
        System.out.println("Camino 2-> a=true, b=false, c=false : ret=0");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        CaminoBasico instance = new CaminoBasico();
        int expResult = 0;
        int result = instance.aMethod(a, b, c);
        assertEquals(expResult, result);
    }
    
    /**
     * Test3 of aMethod method, of class CaminoBasico.
     */
    @Test
    public void testAMethod3() {
        System.out.println("Camino 3-> a=true, b=true, c=? : ret=1");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        CaminoBasico instance = new CaminoBasico();
        int expResult = 1;
        int result = instance.aMethod(a, b, c);
        assertEquals(expResult, result);
    }
    
    /**
     * Test4 of aMethod method, of class CaminoBasico.
     */
    @Test
    public void testAMethod4() {
        System.out.println("Camino 4-> a=false, b=false, c=false : ret=0");
        boolean a = false;
        boolean b = false;
        boolean c = false;
        CaminoBasico instance = new CaminoBasico();
        int expResult = 0;
        int result = instance.aMethod(a, b, c);
        assertEquals(expResult, result);
    }
}
