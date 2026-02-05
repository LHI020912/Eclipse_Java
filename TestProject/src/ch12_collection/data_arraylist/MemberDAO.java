package ch12_collection.data_arraylist;

//수정 및 유지보수
import java.util.ArrayList;
import java.util.List;

public class MemberDAO implements IMemberDAO{
	// DB 대신 사용할 저장소 구성: DB 사용시에는 회원정보 집합을 표현 사용
	private List<MemberDTO> listData = new ArrayList<>();

	@Override
	public void insertMember(MemberDTO dto) {
		/* dto 활용 db에 저장하는 코드 (arrayList에 저장)
		 회원가입 시 유일구별가능한 data는 중복허용X
		 -전달된 dto의 memId값이 이미 저장된 객체들의 memId와 중복 객체 확인
		 List.stream(): 컬렉션에 저장된 elements를 순회해 전달된 코드 처리
		 Stream<T> 객체가 반환(MemberDTO가 반환)
		 Stream.filter(조건): 반환된 stream 객체에 대해 조건연산 진행 가능한 메소드/함수형인터페이스
		 filter(item->item을 이용한 조건식) ex.filter(member->member.getMemId().equals(dto.getMemId())
		 findFirst(): filter 조건에 맞는 객체가 찾아지면 객체반환(Optional객체로 반환)
		 Optional.orElse(null); : 조건에 맞는 객체가 없으면 null반환
		*/
		
		String tmpId = dto.getMemId();
		MemberDTO optDto = listData.stream().filter(member->member.getMemId().equals(tmpId))
							.findFirst().orElse(null);
		if(optDto != null)
			System.out.println("회원가입 실패 : 이미 사용중인 ID입니다.");
		else
			listData.add(dto);
			System.out.println("회원가입 성공");
	}

	@Override
	public void deleteMember(String memId) {
		// memId활용하여 db에서 삭제코드 (삭제가정)
		// ArrayList에서 memId값과 동일한 id를 가진 객체 찾음
		MemberDTO delDto = listData.stream().filter(member->member.getMemId().equals(memId))
				.findFirst().orElse(null);
		if(delDto != null) {
			listData.remove(delDto);
			System.out.println("회원정보가 영구 삭제되었습니다.");
		}else{
			System.out.println("해당 id의 회원이 없습니다.");
		}
	}

	@Override
	public List<MemberDTO> getAllMember() {
		// 모든 회원정보 반환받아서 MemberDTO에 삽입 ArrayList에 포함리턴
		return listData;
	}

	@Override
	public MemberDTO searchMember(String memId) {
		// 회원검색 MemberDTO로 구성해 리턴
		MemberDTO searchDto = listData.stream().filter(member->member.getMemId().equals(memId))
				.findFirst().orElse(null);
		return searchDto;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// MemberDTO 활용해 ArrayList에서 수정
		// 해당 id의 객체참조를 추출
		MemberDTO upDto = listData.stream().filter(member->member.getMemId().equals(dto.getMemId()))
				.findFirst().orElse(null);
		if(upDto != null) {
			int idx = listData.indexOf(upDto); //수정할 객체의 idx값 반환
			listData.set(idx, dto);
			System.out.println("회원정보가 수정되었습니다.");
		}else {
			System.out.println("회원정보를 찾을 수 없습니다.");
		}
	}
}
