package FilePackage;
import java.io.File;
import java.io.IOException;
public class FilesClass {

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Files_Java\\Java.txt");
			if (myObj.createNewFile()) {
				System.out.println("File Created" + myObj.getName());
				System.out.println("Absoulute Path"+myObj.getAbsolutePath());
			} else {
				System.out.println("File Exists");
			}
		} catch(IOException e) {
			System.out.println("An error message");
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally bloack");
		}

	}

}
