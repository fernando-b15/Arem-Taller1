package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	listaEnlazada list = new listaEnlazada();
    	list.add(5);
    	list.add(3);
    	list.add(11);
    	list.add(5);
    	list.add(3);
    	list.add(15);
    	list.add(5);
    	list.add(3);
    	list.add(35);
        list.print();
        Node tempo  = list.getNode(5);
        list.remove(tempo);
        System.out.println(list.size());
        list.print();

    }
}
