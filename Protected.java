package AccessModifiers;

public class Protected extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Protected obj = new Protected();
        int output = obj.z;
        System.out.println("Value of z is:"+output);
        obj.ProtectedMethod();
	}

}
