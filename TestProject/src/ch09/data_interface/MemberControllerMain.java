package ch09.data_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberControllerMain {

	public static void main(String[] args) {
		// 회원등록
		// 회원정보 입력받기
		String id, pass, name, phone, address;
		Scanner sc = new Scanner(System.in);

		System.out.println("회원정보를 입력합니다.");
		System.out.print("id입력 : ");
		id =sc.next();
		System.out.print("pass 입력 : ");
		pass =sc.next();
		System.out.print("이름 입력 : ");
		name =sc.next();
		System.out.print("번호 입력 : ");
		phone =sc.next();
		System.out.print("주소 입력 : ");
		address =sc.next();
		
		// 회원등록 모듈
		// 1. dto 객체생성
		MemberDTO dto = new MemberDTO(id,pass,name,phone,address);
		
		// 2. DB저장을 위한 DAO메소드 호출
		MemberDAO dao = new MemberDAO();
		dao.insertMember(dto);
		// 권장하는 방법
		IMemberDAO idao = new MemberDAO();
		idao.insertMember(dto);
		
		// 회원삭제
		System.out.println("회원정보를 삭제합니다.");
		System.out.print("id입력 : ");
		id =sc.next();
		idao.deleteMember(id);
		
		// 전체회원 조회
		System.out.println("회원정보를 조회합니다.");
		ArrayList<MemberDTO> ar = idao.getAllMember();
		System.out.println("반복문을 통해 ar 출력 코드");
		
		// 한명회원 조회
		System.out.println("회원정보를 조회합니다.");
		System.out.print("id입력 : ");
		id =sc.next();
		MemberDTO mDTO= idao.searchMember(id);
		System.out.println("mDTO 출력코드");
		
		// 회원정보 수정 : 수정할 회원정보 출력
		System.out.println("회원정보를 조회합니다.");
		System.out.print("수정 회원 id입력 : ");
		id =sc.next();
		mDTO= idao.searchMember(id);
		System.out.println("한명 회원정보 출력");
		
		// 수정 내용을 입력받기
		System.out.println("회원정보를 수정합니다.");
		System.out.print("id입력 : ");
		id =sc.next();
		System.out.print("pass 입력 : ");
		pass =sc.next();
		System.out.print("이름 입력 : ");
		name =sc.next();
		System.out.print("번호 입력 : ");
		phone =sc.next();
		System.out.print("주소 입력 : ");
		address =sc.next();
		// 수정할 내용의 객체
		dto = new MemberDTO(id,pass,name,phone,address);
		
		idao.updateMember(dto);
	}
}