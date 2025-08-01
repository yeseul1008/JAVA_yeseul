package day12;

public class Dog extends Animal {
	
	// 추상메소드를 구현하지 않으면 추상클래스 됨.
	// 밑에처럼 추상메소드를 구현해야함
	public void makeSound() {
		System.out.println("멍멍");
	}
}
