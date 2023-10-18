package week3.day1;


public class AxisBank extends BankInfo{
	
	// Methods :deposit()
	
	public void deposit() {
		System.out.println("Deposit account is override");
	}
	

	public static void main(String[] args) {
		AxisBank myBank = new AxisBank();// Created object for AxisBank
		myBank.saving();
		myBank.fixed();
		myBank.deposit();

	}

}
