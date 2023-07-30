package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	
	public void log(String message) {
		//over-write
		System.out.println("Database Logger "+message);
		
	}

}
