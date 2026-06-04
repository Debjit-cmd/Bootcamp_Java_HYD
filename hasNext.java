package variables;
import java.util.Scanner;

public class hasNext {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter words (type 'stop' to end):");

	        while (sc.hasNext()) {
	            String word = sc.next();

	            if (word.equals("stop")) {
	                break;
	            }

	            System.out.println("You entered: " + word);
	        }

	        sc.close();
	    }
	}

