package day5;

public class Person {
	String name;
	int age;
	
	
	// 생성자는 하나라도 존재하면 메인에서 실행할때 기본생성자를 만들어주진 않는다
	// Person(){} 기본생성자는 다른 생성자를 하나라도 정의하지 않으면 자동생성
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 오버로딩(메인에서 객체 생성할때 매개변수를 입력하지않고 생성할 경우를 위해 필요)
	Person(){}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 " + name + ", 나이는 " + age;
	}
}
