package method.quiz;
/*
 *
 *합을 구하는 함수 만들고 호출하세요
 * 두 수를 입력받아 n1부터 n2까지의 합을 반환하세요
 * 
 * */
public class qz3 {
	public static int add(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum = sum + i;
			//return 여기서 작성하면 안됨
		}
		return sum; //return은 public static 괄호 안에서 사용
	}
	
	

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 10;
		int result = add(num1,num2);
		System.out.println(num1 + "부터" + num2 + "까지의 합은" + result + "입니다");
		
	}

}
