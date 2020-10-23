class Account{
	private String id;
	private double balance;
	private double rate;

	public Account(){

	}

	public Account(String id, double balance, double rate){
		this.id = id;
		this.balance = balance;
		this.rate = rate;

	}

	public void setId(String id){
		this.id =id;
	}
	public String getId(){
		return this.id;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}

	public void setRate(double rate){
		this.rate = rate;
	}
	public double getRate(){
		return this.rate;
	}

	public void deposit(double money){
		if(money <= 0){
			System.out.println("money must be positive");
		}else{
			this.balance = this.balance + money;
			System.out.println("SUCCESS");
		}
	}

	public void withdraw(double money){
		if(getBalance() < money){
			System.out.println("FAIL");
		}else{
			this.balance = this.balance - money;
			System.out.println("SUCCESS");

		}
	}
}