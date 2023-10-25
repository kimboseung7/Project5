package method.quiz;
/*
 * 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요
 * 예시) 932 => (= 9 + 3 + 2)
 * */
public class qz7 {
	public static int cal(int num) {
		int sum = 0;
		
		sum = sum + (num%10);
		num = num/10;
		sum = sum + (num%10);
		num = num/10;
		sum = sum + (num%10); // 9%10은 성립 할 수 없으므로 9가 나옴
		return sum;
		
		
		
	}
	public static void main(String[] args) {
		int num = cal(932);
		System.out.println(num);
	}

}
