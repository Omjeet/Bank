package Vehicle;

import loan.VehicleLoan;

public class CarLoan extends VehicleLoan
{
	final String suubtype="car loan";
	double ROI=10.40;
	int tenure=36;
	
	public CarLoan()
	{
	}
	public CarLoan(String Bank_AccHolder_Name,double Loan_Amount)
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

