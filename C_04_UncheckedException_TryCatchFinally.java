package Exception;

public class C_04_UncheckedException_TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Program Started");
	     try {
	    	 int x = 10/2;
	    	 System.out.println("Division result is ="+x);
	     }
	     catch(ArithmeticException e) {
	    	 System.out.println("Something went wrong. Please check");
	     }
	     finally {
	     System.out.println("Program end");
	     }

	}

}
