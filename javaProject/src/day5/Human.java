package day5;

public class Human {
	// 변수
	String name;
	int age;
	String addr;
	
	Human(String name, int age, String addr) //이렇게 하면 호출할때 매개변수가 3개가 있어야함
	{
		this.name = name; //this가 붙으면 앞 Human에서 정의한 name을 의미함
		this.age = age;
		this.addr = addr;
	}
	// 생성자도 오버로딩 가능
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	
	//   메소드 정의(메소드 뒤에는()가 붙음)
	void eat() {
		System.out.println(name + "(이)가 밥을 먹는다!");
	}
	void study() {
		System.out.println(name + "(이)가 공부 한다!");
	}
}
