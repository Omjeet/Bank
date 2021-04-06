package Education;
import loan.EducationalLoan;

public class HigherEduLoan extends EducationalLoan
{
	final String suubtype="Higher EduLoan";
	double ROI=12.40;
	int tenure=24;
	
	public HigherEduLoan()
	{
	}
	public HigherEduLoan(String Bank_AccHolder_Name,double Loan_Amount)
	{
		super(Bank_AccHolder_Name,Loan_Amount);
	}
	public void details()
	{
		super.details();
		
		System.out.println("sub Type :" + suubtype );
		System.out.println("rate of intrest "+ ROI);
		System.out.println("EMI for loan "+ tenure);
		
	}
}
