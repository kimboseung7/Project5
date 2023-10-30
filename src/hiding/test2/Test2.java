package hiding.test2;

public class Test2 {

	public static void main(String[] args) {
		Person person  = new Person();
		person.name = "둘리";
		person.height = 170;
		// 몸무게는 클래스 외부에서 사용불가

	}

}
class Person{
	public String name;
	int height;
	private double weight; // 몸무게는 private를 사용해서 외부에서 사용x
	
	public void showInfo() {
		System.out.println("이름:" + name +"키:" + height + "몸무게:" + weight);
	}
}