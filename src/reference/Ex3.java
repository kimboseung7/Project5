package reference;

public class Ex3 {

	public static void main(String[] args) {
		int num = 50;
		method1(num);
		System.out.println(num);
		
		Subject math = new Subject("수학", 100);
		method2(math);
		System.out.println(math.toString());
	}

	public static void method1(int n) { // 매개변수 기초타입
		n = 5;
	}

	public static void method2(Subject sub) { // 참조타입 사용
		sub.scorePoint = 50; // 호출 되면 값이 카피되서 method2()로 전달 --> 100이 50으로 바뀜

	}



}
