package review_day3;

public class Human {
	// 클래스는 필드(변수) + 메소드로 구성되어있다.
	// 1. 필드(변수) 영역
	String name;
	int age;
	String addr;
	int money;
	
//	// * 생성자
//	public Human(String name) { // String name이 있으니까 Human메소드는 매개변수 하나를 꼭받아야 오류안생김)
//		
//		System.out.println(name + " 객체 생성!");
//	}

	public Human(String name, int age, String addr, int money) {
		this.name = name; // 필드영역 변수 name과 생성자의 매개면서 name을 this로 구분
		this.age = age; // 이 과정을 안하면 System.out.println(kim.money); 이런식으로 출력했을 때
		this.addr = addr; // money가 0으로 출력됨 ( 필드에 저장을 안했기 때문 )
		this.money = money;
		System.out.println(name + " 객체 생성!");
	}
	
	public Human(String name,int age, String addr) {
		this(name, age, addr, 0);
	}
	public Human(String name, int money) {
		this(name, 0, "", money);
	}
	
	// 2. 메소드 영역
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	
}
