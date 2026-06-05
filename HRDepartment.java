package AbstractClass;

public class HRDepartment extends ITDepartment{
	

	public void dept() {
		System.out.println("Dept:Engineering IT");
	}
	public void salary() {
		System.out.println("Salary:This is salary block");
	}
	public void bonus() {
		System.out.println("bonus block");
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		HRDepartment obj=new HRDepartment();
		obj.dept();
		obj.salary();
		obj.setup();
		obj.support();
		obj.bonus();
		
		System.out.println("=======");

}

}
