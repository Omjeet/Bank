package loan;

import Account.LoanAcc;

public class HomeLoan extends LoanAcc
{
	final String suubtype="Home Loan";
	double ROI=8.35;
	public HomeLoan()
	{
	}
	public HomeLoan(String Bank_AccHolder_Name,double Loan_Amount)
	{
		super(Bank_AccHolder_Name,Loan_Amount);
	}
	public void details()
	{
		super.details();
		
		System.out.println("sub Type :" + suubtype );
		System.out.println("rate of intrest "+ ROI);
	}
}
