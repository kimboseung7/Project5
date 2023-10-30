package hiding;

import java.util.Date;

/*
 * 
 * private 변수 선언하고 값 변경하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		MyDate2 date = new MyDate2();
		date.setMonth(2);
		date.setDay(30);
		//멤버변수 안나옴 private로 지정을 해서 MyDate2 클래스 내부에서만 사용가능
		System.out.println("현재 날짜는" + date.getMonth() + "월" + date.getDay() + "일 입니다" );
		date.setDay(10);
		System.out.println("현재 날짜는" + date.getMonth() + "월" + date.getDay() + "일 입니다" );
	}

}class MyDate2{
	private int month; // 월 
	private int day; // 일
	
	public int getMonth() { //외부에서 month의 값을 꺼낼 수 있음 (get의 기능)
		return month;
	}
	public void setMonth(int month) { //return 값없음 매개 변수 있음 
		this.month = month; //멤버변수 = 새로운 값 // 왼쪽과 오른쪽을 구분 하기 위해서 this 사용(전역변수 사용)--> 클래스 자기 자신
	}
	
	public int getDay() {
		return day;
	}
	void setDay(int day) { //setter 메소드 날짜 검증
		
		if (month == 2) { //2월인 경우만 검사
			{
				if (day < 1 || day > 28) {
					System.out.println("2월에는" + day + " 일이 없습니다!!");
					return; //함수가 빠져나가야됨 (함수 종료) 멤버변수 값 교체 x                                                                                                                                                                                                                                                                                                   
				}
			}
			this.day = day; // 검사를 통과 했기 때문에 마지막 변수 만남
		}
	

	}
}
