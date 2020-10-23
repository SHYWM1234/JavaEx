class Test{
	public static void main(String[] args){
		Account a = new Account();
		a.setId("123123");
		a.setBalance(10000.90);
		a.setRate(3.23);

		a.deposit(23);
		System.out.println(a.getBalance());
		a.withdraw(234.98);
		System.out.println(a.getBalance());

	}

}