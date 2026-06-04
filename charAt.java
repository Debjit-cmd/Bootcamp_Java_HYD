package variables;
import java.util.Scanner;

public class charAt {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter index: ");
	        int index = sc.nextInt();

	        char ch = name.charAt(index);

	        System.out.println("Character at index " + index + " is: " + ch);

	        sc.close();
	    }
}


