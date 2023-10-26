package constructor;
/*
 * 생성자 generate 기능 사용하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		Board board = new Board();
		Board board2 = new Board(1,"제목","내용","작성자");
	}

}
class Board {
	int no;
	String title;
	String content;
	String writer;
public Board() {
		super();
}
public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//source 메뉴 - generate constructor 
}
