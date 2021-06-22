package edu.ieu.hilosJava;

public class MainThread {
	public static void main(String[] args) {

	      Cliente cliente1 = new Cliente("Cliente Michell",

	            new int[] {2, 2, 1, 5, 2} 

	      );

	      Cliente cliente2 = new Cliente("Cliente Eduardo",

	            new int[] {1, 3, 5, 1, 1} 

	      );

	      Cliente cliente3 = new Cliente("Cliente Ramon",

	            new int[] {8, 3, 6, 9, 4});


	      Cliente cliente4 = new Cliente("Cliente Alejandro",

	            new int[] {2, 9, 3, 1, 7});


	      long initialTime = System.currentTimeMillis();



	      CajeraThread cajero1 = new CajeraThread("Cajero Cesar",   cliente1, initialTime);

	      CajeraThread cajero2 = new CajeraThread("Cajero Isidro",cliente2, initialTime);

	      CajeraThread cajero3 = new CajeraThread("Cajero Ramon",   cliente3, initialTime);

	      CajeraThread cajero4 = new CajeraThread("Cajero Alejandro",   cliente4, initialTime);



	      cajero1.start();

	      cajero2.start();

	      cajero3.start();

	      cajero4.start();		

	   }

}