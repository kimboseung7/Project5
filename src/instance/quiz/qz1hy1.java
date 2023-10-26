package instance.quiz;

public class qz1hy1 {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.name = "James";
		person.age = 40;
		person.isMarried = true;
		person.kid = 3;
		person.showPerson1Info();
	}

}

class Person1 {
	String name;
	int age;
	boolean isMarried;
	int kid;

	public void showPerson1Info() {
		System.out.println("이름:" + name + "나이:" + age + "결혼여부:" + isMarried + "자녀:" + kid);
	}
}
