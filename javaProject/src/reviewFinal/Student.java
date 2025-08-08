package reviewFinal;

import java.util.jar.Attributes.Name;

public class Student extends Person { // 상속

	// 자식클래스의 생성자는 부모클래스의 생성자를 호출한다.

	int stuNo;

	public Student(String name, int age, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}

	public boolean equals(Object obj) { //obj에 스튜던트로 생성한 kim2객체가 담김
		Student student = (Student) obj; //(다운캐스팅)
		// this(kim의 객체), student(kim2의 객체) 담김
		if (this.getName() == student.getName() && this.getAge() == student.getAge() && this.getHeight() == student.getHeight()) {
			return true;
		} 
		return false;
	}

	public void study() {
		System.out.println("공부 중");
	}

	// 부모클래스에서 메소드 가져와서 다른 내용으로 재정의할수있음(오버라이딩)
	public void eat() {
		System.out.println("학식을 먹는다.");
	}
}
