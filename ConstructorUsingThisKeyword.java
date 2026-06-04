package Constructor;

public class ConstructorUsingThisKeyword {

	int value;
    double TotalMarks;
    String FullName;
	
    ConstructorUsingThisKeyword(){
    	this(10);
		System.out.println("No arguments here");
	}
	
    ConstructorUsingThisKeyword(int val){
    	this("RohanYadav");
		value = val;
		System.out.println("Value="+value);
	}
    
    ConstructorUsingThisKeyword(String Name){
    	System.out.println("String type constructor and name is ="+Name);
    }
	
	void display() {
		System.out.println("flow is correct");
	}

	public static void main(String[] args) {
		ConstructorUsingThisKeyword obj1 = new ConstructorUsingThisKeyword();
		obj1.display();

	}

}
