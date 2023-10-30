package hiding.quiz;

/*
 * Mydate 클래스의 setMonth 메소드에 다음과 같잉 조건을 추가하세요
 * 1~12이 들어오면 값을 변경하고
 * 그외의 값이 들어오면 "잘못된 월입니다" 메시지를 출력합니다
 * */
public class qz3 {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(10);
		date.setDay(30);
		System.out.println("현재 날짜는" + date.getMonth() + "월" + date.getDay() + "일 입니다");
//		date.setDay(10);
//		System.out.println("현재 날짜는" + date.getMonth() + "월" + date.getDay() + "일 입니다");
	}
}

class MyDate {
	private int month;
	private int day;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	void setDay(int day) { // setter 메소드 날짜 검증
		if (month >= 1 || 12 <= month) {
			System.out.println("월 :" + month + "일 :" + day);
		} else if (month == 2) { // 2월인 경우만 검사
			{
				if (day < 1 || day > 28) {
					System.out.println("2월에는" + day + " 일이 없습니다!!");
					return; // 함수가 빠져나가야됨 (함수 종료) 멤버변수 값 교체 x
				}
			}
			this.day = day; // 검사를 통과 했기 때문에 마지막 변수 만남
		}

	}

}
