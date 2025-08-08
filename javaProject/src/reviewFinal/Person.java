package reviewFinal;

public class Person {
	// 클래스 => 객체를 만드는 틀 / 필드(변수) + 메소드
	// 객체 => 클래스를 통해 구체화된것
	//  	 변수 +메소드

	private String name;
	private int age;
	private double height;
	
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	} // 객체를 생성할 때 맨 처음에 호출됨, 리턴타입 없음, 클래스와 이름이 같음, 변수 초기화 용도, 따로 만들지 않아도 자동생성
	
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
	// lombok 나중에 이거 쓰면 get, set 메소드 생략 가능해짐
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
