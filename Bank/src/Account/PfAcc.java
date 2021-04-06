package Account;

public class PfAcc extends BankAcc
{
	final static String AccType= "Pf_Acc";
	double Acc_Balance;
	double ROI= 6.0;
	
	PfAcc()
	{
		
	}
	PfAcc( String Bank_AccHolder_Name, double Acc_Balance)
	{
		super( Bank_AccHolder_Name);
		if(Acc_Balance<10000)
		{
			System.out.println("***********************");
			System.out.println("your acc balance is less than 10000 your acc opening not possible");
		}
		else
		{
			System.out.println("***********************");
			this.Acc_Balance= Acc_Balance;
		}
		
		
	}
	public void details()
	{
		super.details();
		System.out.println("AccType :" + AccType);
		System.out.println("saving account balance :" + Acc_Balance);
		System.out.println("Rate of intresr :"+ ROI);
	}

	
}
