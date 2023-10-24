package method;
/*
 * 1부터 10까지 출력하는 함수 만들고 호출하기
 * 
 * */
public class Ex3 {
	
	
	public static void printTen() {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			 //--> void 이므로 return 사용 안해도됨// 반환한 값x 입력값 x -->void 사용
		}
	}

	public static void main(String[] args) {
		printTen(); //--> 함수 호출

	}

}
