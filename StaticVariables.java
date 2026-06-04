package variables;

public class StaticVariables {

    public String AccountHolderName;
    public static int AccountNumber;
    public int Balance;
    public String BranchName;
    public static double pi;
    public static int EmployeeID;

    public static void main(String[] args) {
    	
    	StaticVariables s=new StaticVariables();

        s.AccountHolderName = "Sita Raman";
        pi = 3.14;
        EmployeeID = 83737373;
        AccountNumber = 11002233;
        s.Balance = 80000000;
        s.BranchName = "HDFC Coforge LTD";

        System.out.println(s.AccountHolderName);
        System.out.println(AccountNumber);
        System.out.println(s.Balance);
        System.out.println(s.BranchName);
        System.out.println(pi);
        System.out.println(EmployeeID);
	}

}
