package mariovelez.psptarea4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario F. Vélez R.
 */
public class ModeloTest {
    
    public ModeloTest() {
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
     * Test of divisionArrays method, of class Modelo.
     */
    @Test
    public void testDivisionArrays()
    {
        System.out.println("divisionArrays");
        double[] arreglo1 = {10,20,30,40,50,60,70,80,90,100};
        double[] arreglo2 = {2,2,2,2,2,2,2,2,2,2};
        Modelo instance = new Modelo();
        double[] expResult = {5,10,15,20,25,30,35,40,45,50};
        double[] result = instance.divisionArrays(arreglo1, arreglo2);
        assertArrayEquals(expResult, result, 0.1);
    }

    /**
     * Test of calcularLogN method, of class Modelo.
     */
    @Test
    public void testCalcularLogN()
    {
        System.out.println("calcularLogN");
        double[] arreglo = {6,6,8.3333,10.3333,12.3333,16.4,20.5,21.75,22.25,23,28.33,29,55.8};
        Modelo instance = new Modelo();
        double[] expResult = {1.7918,1.7918,2.1203,2.3354,2.5123,2.7973,3.0204,3.0796,3.1023,3.1355,3.3440,3.3673,4.0218};
        double[] result = instance.calcularLogN(arreglo);
        assertArrayEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularMedia method, of class Modelo.
     */
    @Test
    public void testCalcularMedia()
    {
        System.out.println("calcularMedia");
        double[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        Modelo instance = new Modelo();
        double expResult = 5.5;
        double result = instance.calcularMedia(arreglo);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of calcularVarianza method, of class Modelo.
     */
    @Test
    public void testCalcularVarianza()
    {
        System.out.println("calcularVarianza");
        double[] arreglo = {1.7918,1.7918,2.1203,2.3354,2.5123,2.7973,3.0204,3.0796,3.1023,3.1355,3.3440,3.3673,4.0218};
        double promedio = 2.8015;
        Modelo instance = new Modelo();
        double expResult = 0.4363;
        double result = instance.calcularVarianza(arreglo, promedio);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularDesvEstandar method, of class Modelo.
     */
    @Test
    public void testCalcularDesvEstandar()
    {
        System.out.println("calcularDesvEstandar");
        double varianza = 0.4363;
        Modelo instance = new Modelo();
        double expResult = 0.6605;
        double result = instance.calcularDesvEstandar(varianza);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularRangLog method, of class Modelo.
     */
    @Test
    public void testCalcularRangLog()
    {
        System.out.println("calcularRangLog");
        double promedio = 2.8015;
        double desvEstandar = 0.6605;
        Modelo instance = new Modelo();
        double[] expResult = {1.4805,2.1410,2.8015,3.4620,4.1225};
        double[] result = instance.calcularRangLog(promedio, desvEstandar);
        assertArrayEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularAntiLog method, of class Modelo.
     */
    @Test
    public void testCalcularAntiLog()
    {
        System.out.println("calcularAntiLog");
        double[] rangLog = {1.4805,2.1410,2.8015,3.4620,4.1225};
        Modelo instance = new Modelo();
        double[] expResult = {4.3953,8.5081,16.4696,31.8811,61.7137};
        double[] result = instance.calcularAntiLog(rangLog);
        assertArrayEquals(expResult, result, 0.0005);
    }  
}