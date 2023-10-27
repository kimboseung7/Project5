package reference.qz;

public class Qz1 {

	public static void main(String[] args) {
		//책 3권 만들기
		Book book1 = new Book(null, null, null, 0);
		Book book2 = new Book(null, null, null, 0);
		Book book3 = new Book(null, null, null, 0);
		//사람 1명 만들기
		Member merber = new Member(0, null, null, null, null); // 인자 

	}

}
class Member {
	int meberNum;
	String name;
	String book1;
	String book2;
	String book3;

	public Member(int meberNum, String name, String book1, String book2, String book3) {
		super();
		this.meberNum = meberNum;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	public void method(Book book) {
		book.price = 100000; //값을 변경함 같은 개체를 공유한 참조변수들은 값이 바뀐 것 처럼 보인다
		
	}

}

class Book {
	
	String title;
	int price;
	String publisher;
	int page;

	public Book(String title, String name, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;
	}





}
