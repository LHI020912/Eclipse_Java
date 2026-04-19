package ch09.book_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 책 등록
		// 책 정보 받기
		String no, title, author;
		int price, count;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("신 권 정보를 입력합니다.");
		System.out.print("책 번호 입력 : ");
		no =sc.next();
		System.out.print("제목 입력 : ");
		title =sc.next();
		System.out.print("작가 입력 : ");
		author =sc.next();
		System.out.print("가격 입력 : ");
		price =sc.nextInt();
		System.out.print("수량 입력 : ");
		count =sc.nextInt();
		
		// 책 등록 모듈
		// 1. dto 객체생성
		BookDTO dto = new BookDTO(no,title,author,price,count);
		
		// 2. DB저장을 위한 DAO 메소드 호출
		IBookDAO idao = new BookDAO();
		idao.insertBook(dto);
		
		// 전권 조회
		System.out.println("전권 조회합니다.");
		ArrayList<BookDTO> ar = idao.getAllBook();
		System.out.println("반복문을 통해 ar 출력 코드");
		
		// 한권 조회
		System.out.println("한권 조회합니다.");
		System.out.print("제목입력 : ");
		title =sc.next();
		BookDTO bDTO= idao.searchBook(title);
		System.out.println("bDTO 출력코드");
		
		// 삭제
		System.out.println("책 정보를 삭제합니다.");
		System.out.print("책 번호 입력 : ");
		no =sc.next();
		idao.deleteBook(no);
		
		// 수정 : 수정할 회원정보 출력
		System.out.println("책을 조회합니다.");
		System.out.print("수정할 책 번호 입력 : ");
		title =sc.next();
		bDTO= idao.searchBook(title);
		System.out.println("bDTO 출력코드");
		
		// 수정 내용 입력 받기
		System.out.println("책 정보를 수정 합니다.");
		System.out.print("책 번호 입력 : ");
		no =sc.next();
		System.out.print("제목 입력 : ");
		title =sc.next();
		System.out.print("작가 입력 : ");
		author =sc.next();
		System.out.print("가격 입력 : ");
		price =sc.nextInt();
		System.out.print("수량 입력 : ");
		count =sc.nextInt();
		
		// 수정할 내용의 객체
		dto = new BookDTO(no,title,author,price,count);
		// DB에 업데이트
		idao.updateBook(dto);
	}

}
