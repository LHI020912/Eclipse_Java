package ch12_collection.data_arraylist;

// 어떻게 이용할 것인지 나열(사용자결정 개발코드)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberControllerMain {
		String id, pass, name, phone, address;
		Scanner sc = new Scanner(System.in);
		MemberDTO dto = null;
	    IMemberDAO idao = new MemberDAO(); // null 대신 바로 객체 생성
		
		// 회원등록
		// 회원정보 입력받기
	public void join() {
		System.out.println("회원정보를 입력합니다.");
		System.out.print("id입력 : ");	id =sc.next();
		System.out.print("pass 입력 : ");pass =sc.next();
		System.out.print("이름 입력 : ");	name =sc.next();
		System.out.print("번호 입력 : ");	phone =sc.next();
		System.out.print("주소 입력 : ");	address =sc.next();
		
		// 회원등록 모듈
		// 1. dto 객체생성
		dto = new MemberDTO(id,pass,name,phone,address);
		idao.insertMember(dto);
	}
	
	public void del() {
		// 회원삭제
		System.out.println("회원정보를 삭제합니다.");
		System.out.print("id입력 : ");
		id =sc.next();
		idao.deleteMember(id);
	}
	
	public void allView() {
		// 전체회원 조회
		List<MemberDTO> ar = idao.getAllMember();
		if(ar.isEmpty()) { // ar == null은 안됨...
			System.out.println("회원이 없습니다.");
		}else{
			System.out.println("회원정보를 조회합니다.");
			for(MemberDTO mem:ar) {
				System.out.println(mem.getMemId()+", "+mem.getMemPass()+", "
				+mem.getMemName()+", "+mem.getMemPhone()+", "+mem.getMemAddress());	
			}
		}
	}
	
	
	public void view() {	
		// 한명회원 조회
		System.out.println("회원정보를 조회합니다.");
		System.out.print("id입력 : ");
		id =sc.next();
		MemberDTO mDTO= idao.searchMember(id);
		if(mDTO != null) {
			System.out.println("~~~~~ "+id+" 회원정보 ~~~~~");
			System.out.println(mDTO.getMemId()+", "+mDTO.getMemPass()+", "
					+mDTO.getMemName()+", "+mDTO.getMemPhone()+", "+mDTO.getMemAddress());
		}else {
			System.out.println("해당회원이 없습니다.");
		}
		
	}
	
	public void re() {
		// 회원정보 수정 : 수정할 회원정보 출력
		System.out.println("회원정보를 조회합니다.");
		System.out.print("수정 회원 id입력 : ");
		id =sc.next();
		MemberDTO mDTO= idao.searchMember(id);
		System.out.println("~~~~~ "+id+" 회원정보 ~~~~~");
		System.out.println(mDTO.getMemId()+", "+mDTO.getMemPass()+", "
				+mDTO.getMemName()+", "+mDTO.getMemPhone()+", "+mDTO.getMemAddress());
		
		// 수정 내용을 입력받기
		System.out.println("회원정보를 수정합니다.");
		System.out.print("id입력 : ");	id =sc.next();
		System.out.print("pass 입력 : ");pass =sc.next();
		System.out.print("이름 입력 : ");	name =sc.next();
		System.out.print("번호 입력 : ");	phone =sc.next();
		System.out.print("주소 입력 : ");	address =sc.next();
		// 수정할 내용의 객체
		dto = new MemberDTO(id,pass,name,phone,address);
		idao.updateMember(dto);
	}
}