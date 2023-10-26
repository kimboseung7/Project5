package constructor;

/*
 * 
 * 사용자정의 생성자를 사용하여 인스턴스 생성하기
 * 
 * */
public class Ex2 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "둘리";
		person1.weight = 80;
		person1.height = 180;
		
		Person person2 = new Person("또치"); //이름 객체만 사용
		person2.weight = 50;
		person2.height = 160;
		
		Person person3 = new Person("도우너", 170, 60); //이름,키 ,몸무게 사용 하여 한 번에 넣을 수 있음 제일 간편함
		
//인스턴스 값을 한 번에 초기화 시킬 때 많이 씀
	}

}

class Person {
	String name;
	int height;
	int weight;
	
	public Person() {//객체를 생성하기 때문에 리턴값이 없음 //특별한 함수
		
	}

	public Person(String nm) {  //이름을 받음
		name = nm;

	}

	public Person(String nm, int he, int we) { //객체를 생성하고 키와 몸무게를 초기화
		name = nm;
		height = he;
		weight = we;
		
	}

}
