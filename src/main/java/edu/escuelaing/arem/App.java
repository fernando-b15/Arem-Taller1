package edu.escuelaing.arem;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static DecimalFormat formato = new DecimalFormat("0.00");
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
