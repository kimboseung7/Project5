package method;

public class Ex1 {
	// 매개변수가 없고 반환값이 없는 메소드
	public static void method1() { //돌려줄 값 x --> void
		// 메소드 내용만 수행한 후 리턴값이 없이 호출한 메소드로 돌아감
		System.out.println("메게변수와 반환값이 둘 다 없는 메소드 입니다.");
		return;// 생략 가능 //return 뒤에 값이 없음 지워도 됨

	}
	// 매개변수가 없고 반환값이 있는 메소드
	public static String method2(){ // 전달 할 값이 없음 // 반환값은 있으므로 return
		return "메게변수가 없지만 변환값이 있는 메소드입니다.";// 반환값과 반환타입이 일치해야함
	}
	// 매개변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) {// 함수 호출시 전달받는 값이 매개변수이며, 메소드 내에서 사용
		int sum = num1 + num2;
		System.out.println("sum:" + sum); //void로 return 값이 없으므로 return 생략
	}
	// 매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1 + num2; //값이 던 식이던 변수던 자료형만 일치하면 ok // 여기서 문자열로 작성하면 오류 
	}
	public static void main(String[] args) { //호출 //동작을 하려면 main 함수를 써야함
		method1();
		
		String str = method2(); // 선언 = 호출
		
		method3(2,3); //인자 2개를 전달해주어야함 //method3 라인이 void 였기 때문에 호출 후 끝 반환 x
		
		int i = method4(1,2);// 반환 값이 있기 때문에 변수를 선언 해주어야함 method4 (1,2) 자리에 3이 돌아옴
		//함수 호출이 끝난 후 대입연산자 실행 -> 대입 연산자 실행은 맨 마지막
	}
}
