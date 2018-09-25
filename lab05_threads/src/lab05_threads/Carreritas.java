package lab05_threads;

public class Carreritas {
	
	public static void main(String[] args) {
		
		ThreadMethod tm = new ThreadMethod();
		RunnableMethod rm = new RunnableMethod();
		
		tm.start();
		rm.run();
	}
}
