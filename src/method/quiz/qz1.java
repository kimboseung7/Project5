package method.quiz;
/*
 * 사칙연산을 수행하는 함수를 만들고 호출하세요
 * 두 숫자를 입력받아 덧셈, 뺄셈 곱셈, 나눗셈, 나머지를 출력하세요
 * */
public class qz1 {
	public static void calculation (float num1, float num2) {
		//결과값이 여러개 이므로 하나의 값이 아님 그러므로 void를 써야함
	  System.out.println("덧셈 :" + (num1 + num2));
	  System.out.println("뺄셈 :" + (num1 - num2));
	  System.out.println("나눗셈 :" + (num1 / num2));
	  System.out.println("곱셈 :" + (num1 * num2));
	  System.out.println("나머지 :" + (num1 % num2));
		
	}

	
	
	
	
	public static void main(String[] args) {
		calculation(2,3);
		
	}

}
