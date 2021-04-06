package Account;

public class SavingAcc extends BankAcc
{
	final static String AccType= "Saving_Acc";
	private double Acc_Balance;
	
	public SavingAcc()
	{
		
	}
	public SavingAcc( String Bank_AccHolder_Name, double Acc_Balance)
	{
		super( Bank_AccHolder_Name);
		if(Acc_Balance<500)
		{	
			System.out.println(Bank_AccHolder_Name+" your acc balance "+Acc_Balance +" less than 500 your acc opening not possible");
		}
		else
		{
	
			this.Acc_Balance= Acc_Balance;
			System.out.println("congo "+ this.Bank_AccHolder_Name+" acc has been created");
		}
	}
	public void GetBalance()
	{
	
		System.out.println("your acc balance "+this.Acc_Balance);
	}
	//depoite method
	public void deposite(double depositeAmt)
	{
		this.Acc_Balance= this.Acc_Balance + depositeAmt;
		//System.out.println("your acc balance "+this.Acc_Balance);
	}
	
	//withdrow method
	public void withdraw(double withdrawAmt)
	{
		
		if (this.Acc_Balance-withdrawAmt>1000)
		{
			System.out.println("you have succsessfully withdraw "+ withdrawAmt +" Amount");
			this.Acc_Balance= this.Acc_Balance- withdrawAmt;
		}
		else
		{
			System.out.println("sorry first maintain your acc balance,it is less than minimum amoun");
		}
	}
	public void details()
	{
		super.details();
		System.out.println("AccType :" + AccType);
		//System.out.println("saving account balance :" + Acc_Balance);
		 
	}

}
