package method.quiz;
/*
 *나누기 함수를 만들고 호출하세요 
 * 두 수를 입려받아 첫번째수에서 두번째 수를 나눈 묷을 출력하세요.
 * 
 * 단, 두번째수가 0이면 " 나누는 수는 0이 될 수 없습니다"를 출력하고 함수를 종료하세요
 * */
public class qz5 {
	public static int divide(int num1, int num2) {                  //public static void divide(int num1, int num2) 써도됨
		if(num2 == 0) {												//if(num2 == 0){
			System.out.println("나누는 수는 0이 될 수 없습니다");			// System.out.println("나누는 수는 0이 될 수 없습니다");	
			return 0;												// return;
		}															// }
		int result = num1 / num2; 									// int result = num1/num2;
		System.out.println(result);									// System.out.println(result);	배치를 if 앞에 배치하면 runtime 오류 발생
		return result;
		
		
	}
	
	

	public static void main(String[] args) {		
		int num1 = 10;												//divide(10,2)
		int num2 = 1;												//divide(0,2)
		int a = divide(num1, num2);
		
	} 

}
