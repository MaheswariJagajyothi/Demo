package demo;

public class TestBankAccount4 extends BankAccount4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBankAccount4 obj = new TestBankAccount4();
		obj.setAccountNo(23498095);
		obj.setBalance(50000);
		int accountNo = obj.getAccountNo();
		System.out.println("Acccount Number :: "+accountNo);
		int sal = obj.getBalance();
		System.out.println("Salary :: "+sal);
	}

}
