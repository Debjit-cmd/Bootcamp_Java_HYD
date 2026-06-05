package Exception;

public class C_02_CheckedException_ThrowsException {

	int x=10/0;
	public void m1() {
		System.out.println("Value of x is="+x);
	}

	public static void main(String[] args) throws Exception{
		
		C_02_CheckedException_ThrowsException obj=new C_02_CheckedException_ThrowsException();
		obj.m1();
		Thread.sleep(10000);
	}

}
