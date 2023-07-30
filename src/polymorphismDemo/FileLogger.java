package polymorphismDemo;

public class FileLogger  extends BaseLogger{

	public void log(String message) {
		//over-write
		System.out.println("File Logger "+message);
		
	}
}
