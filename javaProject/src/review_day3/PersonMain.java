package review_day3;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 30, "인천", 1234);
		
		s.eat(); // 부모클래스에서 호출 가능
		s.study();
		
	}

}
