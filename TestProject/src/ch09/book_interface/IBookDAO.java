package ch09.book_interface;
import java.util.ArrayList;

public interface IBookDAO {
	
	// 도서등록
	public void insertBook(BookDTO dto);
	// 전체 도서 목록 조회
	public ArrayList<BookDTO> getAllBook();
	// 특정 도서 조회
	public BookDTO searchBook(String no);
	// 재고 수정
    public void updateBook(BookDTO dto);
    // 도서 삭제
    public void deleteBook(String no);
}
