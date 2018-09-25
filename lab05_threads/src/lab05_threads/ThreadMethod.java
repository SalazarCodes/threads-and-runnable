package lab05_threads;

public class ThreadMethod extends Thread{
	
	final int velocidad = 27;
	final int descanso_ms = 123;
	private int distRecorrida = 0;
	
	@Override
	public void run() {
		
		System.out.println("Goku ha iniciado");
		while(distRecorrida <= 1000) {
			
			distRecorrida += velocidad;
			
			System.out.println(String.format("Goku ha avanzado:%d en la carrera", distRecorrida));
			
			try {
				Thread.sleep(descanso_ms);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Goku ha terminado la carrera");
	}
}
