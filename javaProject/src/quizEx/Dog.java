package quizEx;

public class Dog extends Animal { // 여기는 원래 빈 코드
	// 1. 에러가 발생하지 않도록 생성자 작성(name, age 초기화)
	// 2. 해당 클래스(Dog)의 객체 생성 후 sound 메소드 호출 시 '멍멍'이 출력되도록 코드를 작성할 것

	public Dog(String name, int age) {
		super(name, age); // 생성자
	}

	// 2. sound 메소드 오버라이딩 슈퍼클래스의 메소드를 서브클래스에서 재정의
	// 슈퍼클래스 메소드의 이름, 매개변수 타입 및 개수, 리턴타입 등 모든것 동일하게작성
	@Override
	public void sound() { //
		System.out.println("멍멍");

	}

	public static void main(String[] args) { // 메인도 메소드의 일종이니까 이렇게 한 클래스에서 같이 작성 가능
		Dog dog = new Dog("바둑이", 3);
		dog.sound(); // 출력: 멍멍
		Animal an = new Animal("초코", 4);
		an.sound();
	}

}