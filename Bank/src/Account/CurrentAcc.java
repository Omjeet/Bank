package Account;

public class CurrentAcc extends BankAcc
{
	final static String AccType= "Current_Acc";
	double Acc_Balance;
	
	CurrentAcc()
	{
		
	}
	CurrentAcc( String Bank_AccHolder_Name, double Acc_Balance)
	{
		super( Bank_AccHolder_Name);
		if(Acc_Balance<10000)
		{
		
			System.out.println("your acc balance is less than 10000 your acc opening not possible");
		}
		else
		{
			
			this.Acc_Balance= Acc_Balance;
			System.out.println("congo "+ this.Bank_AccHolder_Name+" acc has been created");
		}
		
		
	}
	public void details()
	{
		super.details();
		System.out.println("AccType :" + AccType);
		System.out.println("saving account balance :" + Acc_Balance);
	}

}
