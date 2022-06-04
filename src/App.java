
public class App {

	public static void main(String[] args) {
		
		Logger asteriskedlogger = new AsteriskLogger();	
		Logger spacedLogger = new SpacedLogger();
		
		asteriskedlogger.log("OOPS!");
		asteriskedlogger.error("YOU DID SOMETHING WRONG!");
		
		spacedLogger.log("WRONG! TRY AGAIN");
		spacedLogger.error("OOPS! YOU DID IT AGAIN!");

	}

}
