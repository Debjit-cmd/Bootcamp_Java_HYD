package variables;

public class InstanceVariable_CaseStudy_IV {
	
	public String AccountHolderName;
	public int AccountNumber ;
	public int balance;
	public String BranchName;


	public static void main(String[] args) {
		InstanceVariable_CaseStudy_IV iv=new InstanceVariable_CaseStudy_IV();
		iv.AccountHolderName = "Sita Raman";
		iv.AccountNumber = 11002233;
		iv.balance = 80000000;
		iv.BranchName = "HDFC Coforge LTD";
		
	}

}
