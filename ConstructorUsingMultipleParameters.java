package Constructor;

public class ConstructorUsingMultipleParameters {
	
    int value;
    double TotalMarks;
    String FullName;
	
    ConstructorUsingMultipleParameters(){
		System.out.println("Zero arguments");
	}
	
    ConstructorUsingMultipleParameters(int val,double marks,String name){
		value = val;
		TotalMarks = marks;
		FullName = name;
		System.out.println("Value="+value + " " + "TotalMarks="+TotalMarks + " " + "Full Name="+FullName);
	}
	
	void display() {
		System.out.println("flow is correct");
	}

	public static void main(String[] args) {
		ConstructorUsingMultipleParameters obj1 = new ConstructorUsingMultipleParameters();
		obj1.display();
		ConstructorUsingMultipleParameters obj2 = new ConstructorUsingMultipleParameters(10,20,"Rohan Yadav");
		obj2.display();

	}
}
