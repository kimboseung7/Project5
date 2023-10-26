package instance.quiz;
/*
 * 다음과 같이 도서 클래스(Book)를 정의하세요
 * 제목, 가격, 출판사, 페이지수를 멤버변수로 속성으로 갖습니다
 * 
 * 그리고 Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요
 *(자바프로그래밍, 2000, 한빛 컴퍼니, 300) 
 * (스프링,15000,한빛컴퍼니,500)
 * */
public class qz3 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바스프링";
		book1.price = 2000;
		book1.publisher = "한빛컴퍼니";
		book1.page = 300;
		book1.showBoolInfo();
		System.out.println("인스턴트 주소:" + book1);// ->주소
		
		Book book2 = new Book();
		book2.title = "스피링";
		book2.price = 15000;
		book2.publisher = "한빛컴퍼니";
		book2.page = 500;
		book2.showBoolInfo();
		System.out.println("인스턴트 주소:" + book2);// ->주소

	}

}
class Book{
	String title;
	int price;
	String publisher;
	int page;
	
	public void showBoolInfo(){
		System.out.println("제목:" + title + " 가격:" + price + " 출판사:" 
									+ publisher + " 페이지수:" + page);
	}
}