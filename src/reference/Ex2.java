package reference;
/*
 * 
 * 기본형변수와 참조형변수의 메모리 구조 비교하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		// 기본형 변수
		int num1 =1;
		int num2 = 1;
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		
		
		// 참조형 변수 //사용자 정의 // 클래스 객체, 새로운 객체가 생성됨 두 객체는 같은 객체가 아님
		Subject math1 = new Subject("수학", 85); 
		Subject math2 = new Subject("수학", 85);
		boolean result2 = (math1 == math2);
		System.out.println(result2); //두 값이 같지 않음

	}

}
