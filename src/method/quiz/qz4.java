package method.quiz;

/*
 * 빼기 매소드를 만들고 호출하세요
 * 두 수를 입력받아 첫번째 수에서 두번째 수를 뺀후 그 결과를 반환하세요
 * 단, 첫 번째 수가 두 번째 수보다 작으면 -999을 반환하고 함수를 종료하세요 // 오류 코드 반환
 * */
public class qz4 {
	public static int cal(int num1, int num2) {
		if (num1 > num2) {
			int result1 = num1 - num2;
			return result1;
		} else {
			return -999;
		}
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int a = cal(num1, num2);
		System.out.println(a);

	}

}
//public static int cal(int num1, int num2) {
// if(n1<n2){
// return -999; }이렇게 해도됨
// int result = n1-n2;
// return result;