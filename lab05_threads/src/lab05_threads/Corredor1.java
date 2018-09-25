package lab05_threads;

public class Corredor1 extends Thread{
	
	final int velocidad = 45;
	final int descanso_ms = 254;
	private int distRecorrida = 0;
	
	@Override
	public void run() {
		
		System.out.println("Corredor1 ha iniciado");
		while(distRecorrida <= 1000) {
			
			distRecorrida += velocidad;
			
			System.out.println(String.format("Corredor 1 ha avanzado:%d en la carrera", distRecorrida));
			
			try {
				Thread.sleep(descanso_ms);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Corredor 1 ha terminado la carrera");
	}
}
