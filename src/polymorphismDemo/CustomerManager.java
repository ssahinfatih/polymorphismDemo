package polymorphismDemo;

public class CustomerManager {
	
	//buraya ait base logger
	private BaseLogger logger ;
	
	public CustomerManager(BaseLogger logger) {
		
		this.logger = logger;
	}
	
	 public void add() {
		 System.out.println("Müşteri eklendi");
		 this.logger.log("log mesajı");
		 
	 }

}
