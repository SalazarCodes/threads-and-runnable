package lab05_threads;

import java.util.Scanner;

public class Atleta extends Thread{
	
	Scanner data = new Scanner(System.in);
	String names = "";
	
	public void run() {
		
		System.out.println("Ingrese el nombre del atleta :");
		names = data.next();
	
	
	for (int c=1; c<=30; c++) {
		
		System.out.println(c+"km");
	}
	try {
		sleep(9500);
	}
	catch (InterruptedException e) {
		
	}
	System.out.println("\n Llego a la meta "+ names);
	}
}
