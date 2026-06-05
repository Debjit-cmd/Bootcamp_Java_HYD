package Inheritance;

public class ChildClass extends BaseClass {
		public void mult() {
			System.out.println("Here Multiplication will happen");
		}
		public void divide() {
			System.out.println("Here Division will happen");
		}
	public static void main(String[] args) {
		ChildClass obj= new ChildClass();
		obj.mult();
		obj.divide();
		obj.add();
		obj.subtract();
		System.out.println("-------");
		BaseClass obj2= new BaseClass();
		obj2.add();
		obj2.subtract();

	}

}