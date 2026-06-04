package Constructor;

public class ConsttructorWithoutUsingThisKeyword {
	
	int value;
	
	ConsttructorWithoutUsingThisKeyword(){
		System.out.println("Zero arguments");
	}
	
	ConsttructorWithoutUsingThisKeyword(int val){
		value = val;
	}
	
	void display() {
		System.out.println("flow is correct");
	}

	public static void main(String[] args) {
		ConsttructorWithoutUsingThisKeyword obj1 = new ConsttructorWithoutUsingThisKeyword();
		obj1.display();
		ConsttructorWithoutUsingThisKeyword obj2 = new ConsttructorWithoutUsingThisKeyword(10);
		obj2.display();

	}

}
