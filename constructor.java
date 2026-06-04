package Constructor;

public class constructor {
	
	private String name;
	constructor(){
		System.out.println("Constructor Called....");
		name = "Coforge Java Learning..!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor obj = new constructor();
		System.out.println("The name is = "+ obj.name);

	}

}
