package polymorphismDemo;

public class EmailLogger extends BaseLogger{
	
	public void log(String message) {
		//over-write
		System.out.println("Email Logger "+message);
		
	}

}
