package misClases;

import java.util.Arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/* Algoritmo de ordenamiento 
		 *  Metodo de QuickSort (Ordenacion rapida) 
		 *  Con Recursividad para la particion.
		 * Author Nordevelop
		 */
		int maxSize = 16; // array size
		Qarray arr;
		arr = new Qarray(maxSize); // create array
		for(int j=0; j<maxSize; j++) { 
			long n = (int)(java.lang.Math.random()*99);
			arr.agregar(n);
			arr.mostrar();
			arr.quickSort();
			arr.mostrar();
		}
		

	}

}
