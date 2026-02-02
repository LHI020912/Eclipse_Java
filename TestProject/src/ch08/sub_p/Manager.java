package ch08.sub_p;

import ch08.super_p.Employee; // 다른 패키지이므로 import

public class Manager extends Employee {
	// Employee를 상속받음, 필드는 모두 private이므로 직접접근불가
	// part = "abc";
	// 단 필드의 저장 공간은 생성됨
	private String position;
	
	// Manager 객체 정보 저장 메소드
	
	public void setManager() {
		setEmployee();
		//super 클래스 메소드 호출 일반 직원 정보 저장
		System.out.print("직위 입력 : ");
		//Manager 고유정보 저장
		position = sc.next();
		// 두 번 이상 사용하면 sc.close()되어 오류
		//sc.close();
	}
	
	// Manager 객체 정보 출력
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("직위 : "+position);	
	}
	
	public void exitSc() {
		sc.close();
	}
}
