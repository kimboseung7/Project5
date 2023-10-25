package method.quiz;
/*
 * 두 수를 입력받아
 * 둘 중에 큰 수를 출력하는 함수를 만들고 호출하세요
 * 
 * 
 * 
 * 함수이름, 매개변수, 리턴값
 * 수행할 코드
 * */
public class qz2 {

	public static int add(int num1, int num2) { //매게변수 두개를 비교해서 더 큰값을 구하고 출력
		if(num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int i = add(1,2);
		System.out.println(i);

	}

}
