package loopsStatements;

public class For_Each_Loop {

	public static void main(String[] args) {
		String[] names = {"Java","C","C++","Python"};
		System.out.println("Printing the content of the array");
		for(String name : names) {
			System.out.println(name);
		}

	}

}
