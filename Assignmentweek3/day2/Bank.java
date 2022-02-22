package Assignmentweek3.day2;

public class Bank extends SBI {

	public void cibilScore() {
		System.out.println("cibil score is 200");
		// TODO Auto-generated method stub
		
	}

	public void creditScore() {
		System.out.println("credit score is 8");
		// TODO Auto-generated method stub
		
	}

	public void minimumBalance() {
		System.out.println("min balance is 500");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bankBalance() {
		System.out.println("balance amount is 21456.89");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("loan amount is 80000");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Bank pay = new Bank();
		pay.cibilScore();
		pay.creditScore();
		pay.minimumBalance();
		pay.bankBalance();
		pay.maximumLoanAmount();
		
		
		
		
		
	}

}
