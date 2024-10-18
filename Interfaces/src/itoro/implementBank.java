package itoro;

public class implementBank implements bank  {

	int balance = 2000;
	
	
	

	public void viewBalance() {
		
		
		
	}

	
	public void transferAmount() {
		System.out.println ("Your available balance to transfer is =" + balance);
		
	}

	
	public void openFixedDeposite() {
		
		System.out.println ("We are currently pening your accouts please hold ....");
	}

	
	public void demo() {
		
		System.out.println ("We are currently pening your accouts please hold ....");
	}
	
	// Additiinal method 
	
	public void checkInterestRate() {
		
		System.out.println(bank.AccountType + "Have interest rates of 564 ");
	}
	

}
