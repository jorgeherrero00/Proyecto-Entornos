/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto.entornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class ProyectoEntornosTest {
    
    public ProyectoEntornosTest() {
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
     * Test of realizarPago method, of class ProyectoEntornos.
     */
    @Test
    public void testRealizarPago() {
        System.out.println("realizarPago");
        double precio = 200.0;
        double dinero = 500.0;
        ProyectoEntornos instance = new ProyectoEntornos();
        double expResult = 300.0;
        double result = instance.realizarPago(precio, dinero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of verCuentaBancaria method, of class ProyectoEntornos.
     */
    @Test
    public void testVerCuentaBancaria() {
        System.out.println("verCuentaBancaria");
        String puesto = "AdMiNistrador";
        ProyectoEntornos instance = new ProyectoEntornos();
        boolean expResult = true;
        boolean result = instance.verCuentaBancaria(puesto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
