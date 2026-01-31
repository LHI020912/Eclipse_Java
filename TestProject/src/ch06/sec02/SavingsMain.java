package ch06.sec02;

public class SavingsMain {

	public static void main(String[] args) {
		Savings s = new Savings();

		s.setName("홍길동");
        s.setBalance();
        s.inputDeposit();
        s.getInterest();
        s.getBalance();
	}
}