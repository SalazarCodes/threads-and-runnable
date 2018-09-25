package lab05_threads;

public class RunnableMethod implements Runnable{
		
		final int velocidad = 32;
		final int descanso_ms = 146;
		private int distRecorrida = 0;
		
		@Override
		public void run() {
			
			System.out.println("Vegeta ha iniciado");
			while(distRecorrida <= 1000) {
				
				distRecorrida += velocidad;
				
				System.out.println(String.format("Vegeta ha avanzado:%d en la carrera", distRecorrida));
				
				try {
					Thread.sleep(descanso_ms);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Vegeta ha terminado la carrera");
		}
	}


