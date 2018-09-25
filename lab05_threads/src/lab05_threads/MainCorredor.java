package lab05_threads;

public class MainCorredor {
	
	public static void main(String[] args) {
		
		Corredor1 co1 = new Corredor1();
		Corredor2 co2 = new Corredor2();
		
		co1.start();
		co2.start();
	} 

}
