package Vehicle_Loan;

public class Main {

	public static void main(String[] args)
	{
		Vehicle v = new Vehicle("AP5BF5694","PASSION2014","2 wheeler",125000);
		System.out.println(v.takeInsurance());
		System.out.println(v.issueLoan());
	}

}
