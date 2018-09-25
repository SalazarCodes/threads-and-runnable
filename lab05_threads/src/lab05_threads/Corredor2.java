package lab05_threads;

public class Corredor2 extends Thread{
	
	final int velocidad = 53;
	final int descanso_ms = 346;
	private int distRecorrida = 0;
	
	@Override
	public void run() {
		
		System.out.println("Corredor1 ha iniciado");
		while(distRecorrida <= 1000) {
			
			distRecorrida += velocidad;
			
			System.out.println(String.format("Corredor 2 ha avanzado:%d en la carrera", distRecorrida));
			
			try {
				Thread.sleep(descanso_ms);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Corredor 2 ha terminado la carrera");
	}
}
