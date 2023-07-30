package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	public void log(String message) {
		//over-write
		System.out.println("Console Logger "+message);
		
	}
}
