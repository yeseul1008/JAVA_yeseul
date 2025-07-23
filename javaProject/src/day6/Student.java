package day6;

public class Student {
	private int stuNo; //학번
	private String stuName; //이름 
	private String stuDept;//학과
	private int age;//나이
	private String gender;//성별
	
	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
//		System.out.println("이름: " + this.stuName);
//		System.out.println("학번: " + this.stuNo);
//		System.out.println("학과: " + this.stuDept);
	}
	
	Student(int stuNo, String stuName){ // 이름 ,학번
		this(stuNo, stuName,"");
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//		System.out.println("이름: " + this.stuName);
//		System.out.println("학번: " + this.stuNo);
	}
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {
		return age;
	}
	void stuInfo() {
		System.out.println(stuName + " 학생의 학번은 " + stuNo + "학번, 나이는 " + age + " 입니다.");
	}
}
