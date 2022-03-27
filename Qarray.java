package misClases;

import java.util.Arrays;
import java.util.*;

public class Qarray {
	    /*
	     * Clase Qarray del Algoritmo de ordenamiento 
	     *    Método   Quicksort
	     *    Author Nordevelop
	     *Objetos encapsulados con acceso denegado fuera de la clase Qarray
	     *
	     */
	       private long[]vector; 
		private int nElementos; 
		
		public Qarray(int max){ // constructor
		
		vector = new long[max];
		nElementos = 0; // no items 
		}
		/*
		 * Metodos
		 */
		public void agregar(long value){ // 
		
		vector[nElementos] = value; 
		nElementos++; // incremento
		}
		public void mostrar(){ //()para mostrar contenido del Array
		for(int j=0; j<nElementos; j++)	 // for each sin {} una sola instruccion
	           System.out.print(vector[j] + " ");     
		System.out.println(" ");
	
		}
		public void quickSort()
		{
		recQuickSort(0, nElementos-1);
		}
	
		public void recQuickSort(int dcha, int izda){
			
			if(izda-dcha <= 0) // if size <= 1,
				return;
			else { 
				long pivot = vector[izda]; //
		         int partition = partición(dcha, izda, pivot);
		         recQuickSort(dcha, partition-1); //ordena hacia la derecha 
		         recQuickSort(partition+1, izda); //ordena hacia la izquierda
		}
		} // end recQuickSort()
	
		public int partición(int left, int izda, long pivot){
			
			int point_dcha = left-1; 
			int point_izda = izda;
		while(true){ 
			while( vector[++point_dcha] < pivot );
		while(point_izda > 0 && vector[--point_izda] > pivot); 
			if(point_dcha >= point_izda)
				break;
			else 
		intercambio(point_dcha, point_izda); // intercambio elementos
		} // end while(true)
		intercambio(point_dcha, izda);
		return point_dcha; 
		} // fin metodo partitición()
		public void intercambio(int subindice1, int subindice2) // intercambio t2 elementos
		{
		long temp = vector[subindice1]; 
		vector[subindice1] = vector[subindice2];
		vector[subindice2] = temp; 
		} // fin intercambio()

}//fin clase Qarray
