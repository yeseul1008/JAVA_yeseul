package review_day3;

public class Student extends Person {
	// 상속은 부모클래스의 기본생성자를 호출하기 때문에 기본생성자가 아닌 다른 생성자가 있으면 오류남
	private int stuNo;
	
	public Student(String name, int age, String addr, int stuNo) {
//		this.name = name; //부모 클래스의 name이 private이여서 이 코드는 오류남
		super(name, age, addr); // 부모클래스에서 생성자 선택하려면 super 사용
		this.stuNo = stuNo;
	} // 초기화하기
	
	public void study() {
		System.out.println("공부를 한다!");
	}
	
}
