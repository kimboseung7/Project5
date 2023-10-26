package constructor.quiz;
/*자동차(car)을 정의 하는 클래스를 만드세요.
 * 속성: 제조사, 모델명, 색 , 최고속도
 * 디폴트 생성자와 모든 멤버 변수를 입력받는 생성자를 추가하세요
 * 
 * 모든 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
 * 
 */
public class qz2 {

	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.company = "현대";
//		car1.model ="쏘나타";
//		car1.color ="흰색";
//		car1.maxSpeed =200;
//		
//		Car car2 = new Car();
//		car1.company = "기아";
//		car1.model ="레이";
//		car1.color ="검정색";
//		car1.maxSpeed =150;
		
		
		Car car3 = new Car("현대","쏘나타","흰색",200);
		Car car4 = new Car("기아","레이","검정색",150);
		
	}

}

class Car{
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car(){
		
	}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		company = company; //지역변수  -->
		this.model = model; // 전역 변수 model 자기 자신 클래스 멤버변수를 가르킴
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}