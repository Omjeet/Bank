package Account;

public class BankAcc extends BankAccAbstract {
	int Bank_AccNo;
	String Bank_AccHolder_Name;
	static int count;

	{

	}

	BankAcc() {

	}

	BankAcc(String Bank_AccHolder_Name) {

		this.Bank_AccHolder_Name = Bank_AccHolder_Name;

	}

	{
		count++;
		this.Bank_AccNo = count;
	}

	public void details() {
		System.out.println(this.Bank_AccNo);
		System.out.println(this.Bank_AccHolder_Name);
		// System.out.println("congo your acc has been created"+
		// this.Bank_AccHolder_Name);
	}

}
