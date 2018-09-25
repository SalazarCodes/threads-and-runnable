package lab05_threads;

public class Process extends Thread{
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Process(String message) {
		super();
		this.message = message;
	}
	
	public void run() {
		
		for (int i=0; i<=15; i++) {
			
			System.out.println(message);
		}
		System.out.println("Este proceso ha terminado :"+this.getName());		
	}

}
