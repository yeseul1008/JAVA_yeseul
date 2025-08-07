package exam0807;


public class Student extends Human{

	int stuNo ;


	public Student(String name, int age, String gender, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}
	public Student(String name, int age, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}
	public void introduce() {
	}
}
