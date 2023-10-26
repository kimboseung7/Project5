package instance;

/* 
 * 학생클래스 정의하고, 인스턴스 생성하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		
		student.studentID = 1001;
		student.studentName = "둘리";
		student.grade = 2;
		student.adress = "인천 연수구";
		
		System.out.println("학생의 모든 정보를 출력합니다");
		System.out.println("studentID =" + student.studentID);
		System.out.println("studentName =" + student.studentName);
		System.out.println("grade =" + student.grade);
		System.out.println("adress ="+student.adress);
		System.out.println("============================");
		student.showStudentInfo();
		System.out.println("============================");
		System.out.println("객체의 주소는" + student + "입니다");
		
		
		

	}

}
