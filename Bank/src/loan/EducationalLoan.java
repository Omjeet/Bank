package loan;
import Account.LoanAcc;

public class EducationalLoan extends LoanAcc
{

	final String suubtype="Educational Loan";
	
	public EducationalLoan()
	{
	}
	public EducationalLoan(String Bank_AccHolder_Name,double Loan_Amount)
	{
		super(Bank_AccHolder_Name,Loan_Amount);
	}
	public void details()
	{
		super.details();
		
		System.out.println("sub Type :" + suubtype );
		//System.out.println("rate of intrest "+ ROI);
	}
}
