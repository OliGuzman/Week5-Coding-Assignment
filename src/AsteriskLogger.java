
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		//added logic so that the number of asterisks matches the size of the box
		//requires that length of log is >= 5		
		if (error.length() < 5) {
			
			System.out.println("Please enter a log that is longer than 5 characters");	
			
			}else {
				
				for(int i = 0; i < error.length(); i++) {
					System.out.print("*");					
					} 
			
			System.out.println("*************");
			System.out.println("***ERROR: " + error +"***");
			
			for(int i = 0; i < error.length(); i++) {
				System.out.print("*");					
				} 
			System.out.println("*************");				
			}
	}

}
