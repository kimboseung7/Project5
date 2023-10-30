package hiding;

public class Ex3 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("둘리");
		System.out.println("이름:" + person.getName());
	
	
	}
}

class Person {
	private String name;
	private int height;
	private double wight; // private는 public 메소드 사용으로 외부에서 사용할 수 있음

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	// source 메뉴 = generate getter and setter
}
