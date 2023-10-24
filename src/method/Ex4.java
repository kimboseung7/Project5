package method;
/*
 * 입력한 숫자 만큼 "안녕하세요"를 출력하는 함수를 만들고 호출하기
 * */
public class Ex4 {
	
	public static void printHello(int cnt) {
		for(int i = 1; i<=cnt; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHello(3); //함수호출 (인자)안에 int형 입력가능 -> static void printHello에서 메게변수를 int로 설정	매개변수(반환해줘야됨)
		//동적인 프로그램 제작 가능
		}

}
