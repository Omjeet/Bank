package Account;

import loan.HomeLoan;

public class user1 {

	public static void main(String[] args) {
		/*BankAcc acc = new SavingAcc("kirti", 100);
		acc.GetBalance();
		acc.details();

		System.out.println("**************************");

		BankAcc acc1 = new SavingAcc("omjeet", 1000);
		acc1.details();
		acc1.deposite(8000);
		acc1.withdraw(500);
		*/

		/*BankAcc swati= new SavingAcc("swati", 1000);
		swati.details();
		swati.deposite(10000);
		swati.GetBalance();
		swati.withdraw(1000);
		
			
		LoanAcc Akanksha = new HomeLoan("akanksha", 1000000);
		Akanksha.details();
		Akanksha.PayEmi(100000);
		Akanksha.PayEmi(-900000);
		
		*/
			

		System.out.println("***********");

		
		BankAcc akanksha = new SavingAcc("akanksha ", 1000);
		akanksha.details();
		akanksha.GetBalance();
		akanksha.deposite(4000);
		akanksha.GetBalance();
		akanksha.withdraw(3000);
		akanksha.GetBalance();
		akanksha.deposite(-1000);
		akanksha.GetBalance();
	
		

		/*
		 * BankAcc user1= new SavingAcc("omjeet",500); user1.details();
		 * 
		 * System.out.println("**************************");
		 * 
		 * BankAcc user2= new SavingAcc("vakke",1000); user2.details();
		 * user2.GetBalance(); user2.deposite(500); user2.deposite(1000);
		 * user2.GetBalance(); user2.withdraw(500); user2.GetBalance();
		 * 
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user6= new HomeLoan("vakke",15000); user6.details();
		 * user6.PayEmi(5000); user6.PayEmi(10000); user6.PayEmi(1000);
		 * 
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user7= new HomeLoan("vakke",15000);
		 * 
		 */
		/*
		 * BankAcc user50= new SavingAcc("ab",1000); user50.details();
		 * user50.GetBalance(); user50.deposite(0); user50.GetBalance();
		 * user50.withdraw(500); user50.GetBalance(); user50.withdraw(1500);
		 * user50.GetBalance();
		 * 
		 */

		/*
		 * System.out.println("**************************");
		 * 
		 * BankAcc user3= new CurrentAcc("vakke",100000); user3.details();
		 * System.out.println("**************************");
		 * 
		 * BankAcc user4= new PfAcc("vakke",10000); user4.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user5= new PersonalLoan("omi",100000.2); user5.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user6= new HomeLoan("vakke",3400000); user6.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user7= new GoldLoan("omair",78000); user7.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user8= new HigherEduLoan("Aishwarya",78000); user8.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user9= new LowerEduLOAN("Nagesh sir",12000); user9.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user10= new CarLoan("ankit",4000000); user10.details();
		 * System.out.println("**************************");
		 * 
		 * LoanAcc user11= new BikeLoan("vinay sir",80000); user11.details();
		 */
	}

}
