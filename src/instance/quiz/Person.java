package instance.quiz;

/*
 * 다음과 같이 사람클래스(Person)을 정의하세요.
 * 이름, 나이, 결혼여부,자식수를 속성으로 갖습니다
 * 
 * */
public class Person {
	String name;
	int age;
	boolean isMarried;
	int kid;

	public void showPersonInfo() {
		System.out.println("이름:" + name + "나이:" + age + "결혼여부:" + isMarried + "자녀:" + kid);
	}
}