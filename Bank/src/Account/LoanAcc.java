package Account;

public class LoanAcc extends BankAcc
{
	String AccType= "Loan_Acc";
	double Loan_Amount;
	
	
	public LoanAcc()
	{
		
	}
	public LoanAcc(String Bank_AccHolder_Name,double Loan_Amount)
	{
		super(Bank_AccHolder_Name);
		this.Loan_Amount= Loan_Amount;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Loan amount :" + Loan_Amount);
		System.out.println("Acc Type :" + AccType );
	//	System.out.println("Loan EMIs :" + tenure +" month");
	}
	public void PayEmi(double emi)
	{
		if(this.Loan_Amount>=emi && emi>0)
		{
			this.Loan_Amount= this.Loan_Amount - emi;
			System.out.println("EMI AMOUNT "+ emi);
			System.out.println("your loan amount "+this.Loan_Amount);
			System.out.println("your EMI credited" );
			
			if(this.Loan_Amount==0.0)
			{
				System.out.println("congratulation your loan free");
			}
		}
		else 
		{
			if(this.Loan_Amount==0.0)
			{
				System.out.println("Ayee idiod you are already loan free");
			}
			else
			{
				System.out.println("Please enter valid emi-amount");
			}
			
		}
		
	}

	
}
   