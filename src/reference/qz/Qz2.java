package reference.qz;


/*
 * 부서(Department)을 정의하는 클래스를 만드세요/
 * 속성: 부서장, 수석연구원, 책임연구원
 * 책(Employee)을 정의하는 클래스를 만드세요.
 * 속성: 이름, 나이, 월급, 근속년수
 * */
public class Qz2 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("둘리", 50, 5000000, 20);
		Employee employee2 = new Employee("또치", 40, 4000000, 10);
		Employee employee3 = new Employee("도우너", 30, 3000000, 3);

		Department dapartment = new Department(employee1, employee2, employee3);

	}
}

class Employee {
	String name;
	int age;
	int wage;
	int year;

	public Employee(String name, int age, int wage, int year) {
		super();
		this.name = name;
		this.age = age;
		this.wage = wage;
		this.year = year;
	}

}

class Department {
	Employee dp;
	Employee cr;
	Employee sr;

	public Department(Employee dp, Employee cr, Employee sr) {
		super();
		this.dp = dp;
		this.cr = cr;
		this.sr = sr;
	}

}
