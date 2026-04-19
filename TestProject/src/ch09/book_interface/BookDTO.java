package ch09.book_interface;

public class BookDTO {
	private String no;
	private String title;
	private String author;
	private int price;
	private int count;
	
	public BookDTO(String no,String title,String author, int price, int count) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.price = price;
		this.count = count;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
