package edu.ieu.hilosJava;

public class Main {
	public static void main(String[] args) {
        Cliente cliente1=new Cliente("cliente Mictch",new int[] {2,2,1,5,2});
        
        Cliente cliente2 = new Cliente("cliente Edu",new int [] {1,3,5,1,1});
        
        Cliente cliente3=new Cliente("Cliente Ramon", new int[] {4,1,2,8,7});
	
		Cliente cliente4=new Cliente("Cliente Alejandro", new int[] {2, 9, 3, 1, 7});
        
        Cajera cajero1=new Cajera("Cajero Cesar");
        
        Cajera cajero2=new Cajera("Cajero Isidro");
        
        Cajera cajero3=new Cajera("Cajero Ramon");
	
		Cajera cajero4=new Cajera("Cajero Alejandro");
        //inicializamos el tiempo 
        long initialTime =System.currentTimeMillis();
        
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
        cajero3.procesarCompra(cliente3, initialTime);
		cajero4.procesarCompra(cliente4, initialTime);
	   }

}