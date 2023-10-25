package method.quiz;
/*
 *계산기 메소드를 만들고 호출하세요 
 *두 수와 기능(문자 + - / *)을 입력받아 연산을 수행하고 결과를 출력하세요
 * 
 * */
public class qz6 {
	
	public static void cal(char sign, int n1, int n2) {
		switch (sign) {
		case '+':
			System.out.println(n1+ n2);
		break;
		case '-':
			System.out.println(n1-n2);
		break;
		case '*':
			System.out.println(n1*n2);
		break;
		case '/':
			System.out.println(n1/n2);
		break;
		
		}
		
	}

	public static void main(String[] args) {
		cal('+', 3, 5);
	}

}
