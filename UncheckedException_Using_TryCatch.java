package Exception;

public class UncheckedException_Using_TryCatch {

	public static void main(String[] args) throws Exception{
		
	     System.out.println("Program Started");
	     try {
	    	 int x = 10;
	    	 System.out.println("Division result is ="+x);
	     }
	     catch(ArithmeticException e) {
	    	 System.out.println("Something went wrong. Please check");
	     }
	     System.out.println("Program end");
	}

}
