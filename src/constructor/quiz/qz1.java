package constructor.quiz;

/*
 * 책을 정의하는 클래스 (Book)
 * 멤버변수: 제목, 가격, 출판사, 페이지수
 * 디폴트 생성자와 모든 멤버변수를 입력받는 생성자를 추가하세요
 * 
 * 그리고 각각 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
 * */
public class qz1 {

	public static void main(String[] args) {
//		Book book1 = new Book("스프링부트",30000,"한빛출판사",200);
		Book book1 = new Book();
		book1.title = "자바스프링";
		book1.price = 2000;
		book1.publisher = "한빛컴퍼니";
		book1.page = 300;
		Book book2 = new Book("자바프로그래밍",10000,"한빛출판사",300);
	}

}
class Book{
	String title;
	int price;
	String publisher;
	int page;
	public Book() {
		
	}
	public Book(String title, int price, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher; //매게 변수 갈색
		this.page = page;
	}

	
	
	
}