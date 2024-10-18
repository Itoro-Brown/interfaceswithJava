package itoro;

//This is an interface , all the methods do not have a body 

public interface  bank {
	
	public String AccountType = "Savings";
	String AccountType2 = "Current";
	
	
	public void viewBalance ();
	
	public void transferAmount();
	
	public void openFixedDeposite ();
	

	 public void demo();

}



// This is an abstract class, contains methods without body and methods with body 
