package ch09.book_interface;
import java.util.ArrayList;

public class BookDAO implements IBookDAO{

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("신권 등록 완료");
		System.out.println(dto.getNo()+"\t"+dto.getTitle()+"\t"+dto.getAuthor()
		+"\t"+dto.getPrice()+"\t"+dto.getCount());
	}

	@Override
	public ArrayList<BookDTO> getAllBook() {
		// 모든 책정보 반환받아 BookDTO에 삽입 ArrayList에 포함하여 리턴
		return null;
	}

	@Override
	public BookDTO searchBook(String no) {
		// 회원검색 BookDTO로 구성해 리턴
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		// BookDTO 활용해 DB에서 수정
		
	}

	@Override
	public void deleteBook(String no) {
		// no 활용하여 db에서 삭제코드 (삭제가정)
		System.out.println("책정보가 영구 삭제되었습니다.");
	}
}