package FilePackage;

import java.io.File;

public class GetFileInformation {

	public static void main(String[] args) {
		File myObj1 = new File("C:\\Files_Java\\Test Case_Amazon Homepage.xlsx");
		if(myObj1.exists()) {
			System.out.println("File Name:"+myObj1.getName());
			System.out.println("Absolute Path:"+myObj1.getAbsolutePath());
			System.out.println("Writeable:"+myObj1.canWrite());
			System.out.println("Readable:"+myObj1.canRead());
			System.out.println("File size in byte:"+myObj1.length());
		} else {
			System.out.println("File does not exist");
		}

	}

}
