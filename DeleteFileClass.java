package FilePackage;

import java.io.File;

public class DeleteFileClass {

	public static void main(String[] args) {
		File obj1 = new File("C:\\Files_Java\\Java.txt");
		if(obj1.delete()) {
			System.out.println("Deleted the File"+obj1.getName());
		} else {
			System.out.println("File has been already deleted");
		}

	}

}
