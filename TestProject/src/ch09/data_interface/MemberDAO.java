package ch09.data_interface;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO{

	@Override
	public void insertMember(MemberDTO dto) {
		// dto 활용 db에 저장하는 코드 (저장가정)
		System.out.println("회원가입 성공");
		System.out.println(dto.getMemId()+"\t"+dto.getMemPass()+"\t"
		+dto.getMemName()+"\t"+dto.getMemPhone()+"\t"+dto.getMemAddress());
	}

	@Override
	public void deleteMember(String memId) {
		// memId활용하여 db에서 삭제코드 (삭제가정)
		System.out.println("회원정보가 영구 삭제되었습니다.");
	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// 모든 회원정보 반환받아서 MemberDTO에 삽입 ArrayList에 포함리턴
		return null;
	}

	@Override
	public MemberDTO searchMember(String memId) {
		// 회원검색 MemberDTO로 구성해 리턴
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// MemberDTO 활용해 DB에서 수정
		
	}

}
