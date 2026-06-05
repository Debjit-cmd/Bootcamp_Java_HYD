package FilePackage;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\\\Files_Java\\\\Java.txt");
			myWriter.write("Trainer is friendly!");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error");
			e.printStackTrace();
		}

	}

}
