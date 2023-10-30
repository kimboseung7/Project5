package hiding.quiz;
/*
 * 자동차(Car)을 정의하는 클래스를 만드세요/
 * 속성: 제조사, 모델명, 색, 최고속도
 * 기능: 각 멤버변수의 getter과 setter
 * 
 * 자동차 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
 * 이때, 자동차의 정보는 setter를 사용해서 변경하세요.
 * (현대, 소나타,흰색,200)
 * 인스턴스의 정보를 출력하세요.
 * 이때, 자동차의 정보는 getter를 사용해서 출력하세요
 * 
 * */
public class qz2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCompany("현대");
		car1.setModel("소나타");
		car1.setColor("흰색");
		car1.setSpeed(200);
		System.out.println("제조사:" + car1.getCompany() + " 모델:" + car1.getModel() + " 색상:" + car1.getColor() + " 속도:" + car1.getSpeed());
	}				//get메소드를 호출한 자리에 value 값이 남는다 (반환됨)

}
class Car{
	private String company; //제조사
	private String model; //모델
	private String color; //색상
	private int speed; //속도
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
