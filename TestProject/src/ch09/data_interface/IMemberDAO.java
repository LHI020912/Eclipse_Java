package ch09.data_interface;

import java.util.ArrayList;

// 컨트롤러와 DAO의 중간자 역핳을 진행함
public interface IMemberDAO {
	// 추상메소드
	
	// 회원등록: 1명의 회원정보를 받아 DB에 저장 후 종료(반환값X)
	public void insertMember(MemberDTO dto);

	// 회원삭제: 회원아이디(memId)를 전달받아
	// DB에서 해당되는 회원 찾아 삭제 종료(반환값X)
	public void deleteMember(String memId);
	
	// 전체 회원조회: DB(회원테이블)에서 전체 회원 정보를 반환
	// 회원 여러명: MemberDTO type instance 여러개 저장
	// = Array [하지만 배열은 처음부터 크기를 고정해야 함(부적절)]
	// = ArrayList 가변배열처럼 사용 가능
	public ArrayList<MemberDTO> getAllMember();
	
	// 한명 회원조회
	// memId를 전달받아 db에 검색 회원한명의 정보(MemberDTO)를 반환 메소드
	public MemberDTO searchMember(String memId);
	
	// 회원정보 수정
	// memId를 포함하는 수정정보 전달받아 db에서 정보수정 후 종료(반환값X)
	public void updateMember(MemberDTO dto);
	
}
