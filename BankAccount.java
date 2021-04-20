public class BankAccount {
	/**
	 * A bank account has a balance that can be changed by deposits and
	 * withdrawals.
	 */
	private String acctNumb;
	private double balance;

	/**
	 *Make a no arguments Bank Account Constructor
	 */
	public BankAccount() {
		
	}

	/**
	 * Make 2 bank account constructors which include 2 parameters
	 * 
	 * 
	 * @param anacctNumb
	 *            the account number for this account
	 * 
	 * @param initialBalance
	 *            the initial balance
	 */
       public BankAccount(String accotNumb, double balancee) {
    	   this.acctNumb = accotNumb;
    	   this.balance = balancee;
       }
    	  public BankAccount(double initialBalance, String anacctNumb) {
    		  
    			acctNumb = anacctNumb;
    			balance = initialBalance;
    		}
		
	
	 
	

	
	/**
	 * Make a getter and setter for each instance variable
	 */
	public String getBalance() {
		return "The balance is "+ this.balance;
	}
	public String getAccountNumber(){
		
		return this.acctNumb;
		
	}
	public void setBalance (double balance) {
		this.balance = balance;
	}
	
	public void setAccountNumber(String acctnumber) {
		this.acctNumb = acctnumber;
		
	}
	
	
	/**
	 * Override the toString method in order to output the data for an object
	 * 
	 * 
	 * @return description of Account
	 */
	public String toString() {
        return "The balance is $" + Math.round(balance) + " the account number is " + this.acctNumb;
    }
	

	/**
	 * Deposits money into the bank account.
	 * 
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		balance+=amount;
	}
	
	
	/**
	 * Withdraws money from the bank account.
	 * 
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
       public void withdraw(double amount) {
		balance -= amount;
	}

	
	/**
	 * Writes the account number of the current account followed by the number 
	 * of an account provided by a parameter
	 * 
	 * 
	 * @param b
	 *         a BankAccount object
	 */
    	  public void twoAccounts(BankAccount b) {
    		  
    		  System.out.println("Current Bank Account number is " + this.getAccountNumber() + "The other account number is " + b.getAccountNumber());
    		  
    	  }
	
	
	/**
	 * Calculate the monthly interest that the account gains
	 * Equation= balance*rate/12/100
	 * 
	 * @param rate
	 *         rate being applied to the account formatted as 0.0
	 */
    	  public void calcMonthlyInterest(double rate) {
    		 double amount  = this.balance * rate/12/100;
    		 this.deposit(amount);
    	  }
	

	// USE THIS AS YOUR MAIN METHOD
	public static void main(String[] args) {
		
		BankAccount one = new BankAccount(1000, "12345");
		System.out.println(one.toString());
				
		one.deposit(200);
		System.out.println(one);
		one.withdraw(25);
		System.out.println(one);
		System.out.println();
		
		BankAccount two = new BankAccount(90, "333");
		System.out.println(two.toString());
	    two.deposit(20);
		two.twoAccounts(one);
		System.out.println(two);
		System.out.println();

		BankAccount three = new BankAccount(1000, "111111");
		System.out.println(three.getBalance());

	}
}