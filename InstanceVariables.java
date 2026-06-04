package variables;

public class InstanceVariables {
	
	public int rollNum;
	public String name;
	public int totalMarks;
	public int number;

	public static void main(String[] args) {
		InstanceVariables v=new InstanceVariables();
		v.rollNum = 129;
		v.name = "Debjit";
		v.totalMarks = 100;
		v.number = 980;
		
		System.out.println(v.rollNum);
		System.out.println(v.name);
		System.out.println(v.totalMarks);
		System.out.println(v.number);

	}

}
