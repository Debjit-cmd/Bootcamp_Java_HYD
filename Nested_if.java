package DecisionMakingStatements;

public class Nested_if {

	public static void main(String[] args) {
		String address = "USA";
		if(address.endsWith("India")) {
			if(address.contains("Meerut")) {
				System.out.println("Your City is Meerut");
			}
		    else if (address.contains("Noida")) {
			   System.out.println("Your City is Noida");
		    }
		    else {
			  System.out.println(address.split(",")[1]);
		    }
		 } else {
			 System.out.println("You are living in India");
		 }
	}

}
