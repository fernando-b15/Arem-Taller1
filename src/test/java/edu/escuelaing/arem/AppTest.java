package edu.escuelaing.arem;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static double[] caso1= {160,591,114,229,230,270,128,1657,624,1503};
    public static double[] caso2= {15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
    public static double[] caso3= {10,5,15,11.5,35,2.5,35.5,20,15.5,18};
    private listaEnlazada list;
    private listaEnlazada list1;
    private listaEnlazada list2;
    private static DecimalFormat formato = new DecimalFormat("0.00");

    @Before
    public void add() {
    	list = new listaEnlazada();
        for (double n:caso1) {
            list.add(n);
        }
        list1 = new listaEnlazada();
        for (double n:caso2) {
            list1.add(n);
        }
        list2 = new listaEnlazada();
        for (double n:caso3) {
            list2.add(n);
        }
    }
    @Test
    public void debeCalcularMedia() {
        assertEquals(550.60,list.getMean(),0.1);
    	assertEquals(60.32,list1.getMean(),0.1);
    	assertEquals(16.80,list2.getMean(),0.1);
    }
    @Test
    public void debeCalcularDesviacionEstandar() {
        assertEquals(572.03,list.getStandardDesviation(),0.1);
    	assertEquals(62.26,list1.getStandardDesviation(),0.1);
    	assertEquals(11.13,list2.getStandardDesviation(),0.1);
    }
    @Test
    public void debePoderConsultar() {
        assertEquals(160,list.getHead().getData(),0.1);
    	assertEquals(138.2,list1.getTail().getData(),0.1);
    	assertEquals(11.5,list2.getNode(3).getData(),0.1);
    }
    @Test
    public void debePoderConsultarPrior() {
    	assertEquals(230.0,list.getNode(5).getPriorNode().getData(),0.1);
    	assertEquals(6.5,list1.getNode(3).getPriorNode().getData(),0.1);
    	assertEquals(20.0,list2.getNode(8).getPriorNode().getData(),0.1);
    }
    @Test
    public void debePoderConsultarNext() {
    	assertEquals(128.0,list.getNode(5).getNextNode().getData(),0.1);
    	assertEquals(28.4,list1.getNode(3).getNextNode().getData(),0.1);
    	assertEquals(18.0,list2.getNode(8).getNextNode().getData(),0.1);
    }
    @Test
    public void debePoderEliminar() {
    	Node node = list.getNode(5);
    	list.remove(node);
    	assertTrue(list.size()==9);
        assertEquals(128.0,list.getNode(5).getData(),0.1);
        assertEquals(1657,list.getNode(6).getData(),0.1);
    }
   

   
}
