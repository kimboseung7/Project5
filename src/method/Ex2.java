package method;

public class Ex2 {
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	

	public static void main(String[] args) {
		int num1 =3;
		int num2 =5;
		int sum = add(num1,num2); // --> 안 써주면 메인 함수에서 확인 x // --> add(num1,num2)가 없어지고 8이됨 그 후 대입연산자 작동으로 변수값 sum이 8저장됨 
		
		int sum2 = add(5,5);
		int sum3 = add(10,10);
		System.out.println(num1 + " + " + num2 + " = " + sum); //-> 따라서 sum에 8이 저장되있으므로 sysout(sum) 하면 8이 출력됨

	}

}
