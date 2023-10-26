package instance.quiz;

import java.util.Date;

/*
 *다음과 같이 주문클래스(Order)를 정의하세요 
 *주문번호, 주문날짜, 주문자이름,배송지를 속성으로 갖습니다
 *모든 주문 정보를 출력하는 showOrderInfo 함수를 갖습니다
 * */
public class qz2 {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNum = 1111;
		order.orderDate = "2018년3월12일";
		order.orderer = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		order.showOrgerInfo();
		
		Date date = new Date(); //util 패키지 사용
		System.out.println(date);
		date.setMonth(12);
		System.out.println();
	}

}
class Order{
	int orderNum;
	String orderDate;
	String orderer;
	String address;
	
	
	public void showOrgerInfo() {
		System.out.println("주문번호:" + orderNum + " 주문날짜:" + orderDate + " 주문자이름:" + orderer + " 배송지:" + address);
		
	}
}