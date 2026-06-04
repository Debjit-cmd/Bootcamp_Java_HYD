package variables;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
//		String value = sc.next();
		String value = sc.nextLine(); // reads the entire line
		System.out.println("Entered Values are:"+value);
		sc.close();
	}
}
