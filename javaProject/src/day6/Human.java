package day6;

public class Human {
	/// 생성자에서 this()의 활용
	/// 생성자에서 this() 메소드는 오버로딩할때 다른 생성자를 호출하는 데 사용
	/// this()는 생성자의 첫 줄에 있어야함
	
	// 필드영역
	private String name;
	int age;
	double height;

	
	// 생성자 영역
	Human(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height; 
		
	}

	Human(String name, int age) {
		this(name, age, 0.0); //위에있는 생성자 호출(height는 초기변수인 0.0을 보냄)
	}
	// 		this.name = name;
	//		this.age = age;
	// 이렇게 몇 줄 더 쓸걸 줄일수있음
	
	Human(String name) {
		this(name,0,0.0);
	}
	//	this.name = name; 
	// 이렇게 몇 줄 더 쓸걸 줄일수있음


}
