package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EmailLogger logger = new EmailLogger();
		// logger.Log("log message 1 ");

//		BaseLogger[] loggers = new BaseLogger[]
//		{ new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
//		
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		
		customerManager.add(); 
		
		

	}

}
