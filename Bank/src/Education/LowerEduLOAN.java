package Education;
import loan.EducationalLoan;

public class LowerEduLOAN extends EducationalLoan
{

	final String suubtype="LowerEduLOAN";
	double ROI=12.40;
	int tenure=12;
	
	public LowerEduLOAN()
	{
	}
	public LowerEduLOAN(String Bank_AccHolder_Name,double Loan_Amount)
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
