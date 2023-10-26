package instance;
/*
 * 학생 클래스
 * */
public class Student {
	int studentID; //학번
	String studentName; //이름
	int grade; // 학년
	String adress; //주소 //String은 객체이므로 디버깅을 했을 때 처음에 빈값임
	
	//학생의 모든 정보를 보여주는 함수 선언
	public void showStudentInfo() {
		System.out.println("학번:" + studentID + "이름:" + studentName + "학년:" + grade + "주소:" + adress);
	}
}
