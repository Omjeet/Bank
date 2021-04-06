package loan;
import Account.LoanAcc;

public class VehicleLoan extends LoanAcc
{
	final String suubtype="Vehicle Loan";
	
	public VehicleLoan()
	{
	}
	public VehicleLoan(String Bank_AccHolder_Name,double Loan_Amount)
	{
		super(Bank_AccHolder_Name,Loan_Amount);
	}
	public void details()
	{
		super.details();
		
		System.out.println("sub Type :" + suubtype );
		
	}
}
