package lab05_threads;

public class Main {
	
	public static void main(String[] args) {
		
		Process hilo1 = new Process("Hilo 1");
		Process hilo2 = new Process("Hilo 2");
		Process hilo3 = new Process("Hilo 3");
		
		hilo1.setMessage("Este es el mensaje del hilo 1");
		hilo2.setMessage("Este es el mensaje del hilo 2");
		hilo3.setMessage("Este es el mensaje del hilo 3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}