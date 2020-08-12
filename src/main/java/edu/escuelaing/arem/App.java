package edu.escuelaing.arem;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Esta aplicacion es para calcular datos estadisticos como la media y desviacion estandar de numeros reales contenidos en un archivo txt
 *
 * @author Fernando Barrera Barrera
 */
public class App 
{
	private static DecimalFormat formato = new DecimalFormat("0.00");
	/**
     * Main methot este metodo lee un archivo txt que contiene numeros reales para las operaciones de la aplicacion 
     *
     * @param args Args
     */
    public static void main( String[] args )
    {
    	try {
    		File datos = new File("datos.txt");
			Scanner lector = new Scanner(datos);
			while(lector.hasNextLine()) {
				listaEnlazada list = new listaEnlazada();
				String line = lector.nextLine();
				String[] numeros = line.split(" ");
				for (String num : numeros) {
	                double dato = Double.parseDouble(num);
	                list.add(dato);
	            }
				
				list.print();
				System.out.println("Mean : "+formato.format(list.getMean()));
				System.out.println("StandardDesviation : "+formato.format(list.getStandardDesviation()));
				

			}
			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

    }
    
}
