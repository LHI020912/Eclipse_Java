package ch08.super_p;

import java.util.Scanner;

public class Employee {
	//private이라 상속은안됨. 하지만 밑에 pulic 호출 때문에 간접 사용은 가능
	private String empNo, name, part;
	public Scanner sc = new Scanner(System.in);
	//멤버필드 값 설정 메소드 구성
	public void setEmployee() {
		System.out.print("사번 입력 : ");
		empNo = sc.next();
		System.out.print("성명 입력 : ");
		name = sc.next();
		System.out.print("부서 입력 : ");
		part = sc.next();
		
		//sc.close();
	}
	
	//멤버필드 값 출력
	public void showEmpInfo() {
		System.out.println("\n・𝜗𝜚・┈・┈・𝜗𝜚・┈・┈・𝜗𝜚・┈・┈・𝜗𝜚・");
		System.out.println("사번 : "+empNo);
		System.out.println("성명 : "+name);
		System.out.println("부서 : "+part);
	}
}
