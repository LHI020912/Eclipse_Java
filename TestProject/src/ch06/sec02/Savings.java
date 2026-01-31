package ch06.sec02;

import java.util.Scanner;

public class Savings {
	private String name;
	private int deposit, interest, balance;
	
	void setName(String n) {
		name=n;
		System.out.println("예금주 : "+name);
	}
	
	void setBalance() {
		balance = 10000;
		System.out.print("입금 전 잔액: "+balance);
	}
	
	String getName() {
		return name;
	}
	
	void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n예금액 입력 : ");
		deposit = sc.nextInt();
		
		balance += deposit;
		
		sc.close();
	}
	
	int getInterest() {
		interest = (int)(balance *0.1);
		balance += interest;
		System.out.println("이자 : "+interest);
		
		return interest;
	}

	int getBalance() {
		System.out.printf("최종 잔액 : %d",balance);
		return balance;
	}
}