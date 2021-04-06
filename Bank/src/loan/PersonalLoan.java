package loan;

import Account.LoanAcc;
public class PersonalLoan extends LoanAcc
{
	final String suubtype="PersonalLoan";
	double ROI=12.40;
	public PersonalLoan()
	{
	}
	public PersonalLoan(String Bank_AccHolder_Name,double Loan_Amount)
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
