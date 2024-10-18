package itoro;

public class demoClass {
	
	public static void main (String[] args) {
		
		
		bank ba;
		
		
		
		implementBank imBank = new implementBank();
		
		imBank.openFixedDeposite();
		imBank.transferAmount();
		imBank.viewBalance();
		imBank.checkInterestRate();
		System.out.println(bank.AccountType);
		System.out.println(bank.AccountType2);
		
		// This is the bank interface implemented 
		ba = imBank;
		ba.viewBalance();
	}

}
