package loan;

import Account.LoanAcc;

public class GoldLoan extends LoanAcc
{

	final String suubtype="gold loan";
	double ROI=6.02;
	public GoldLoan()
	{
	}
	public GoldLoan(String Bank_AccHolder_Name,double Loan_Amount)
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

