package day5;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 차있는 객체를 생성하는 경우
		Person hong = new Person("홍길동", 30);
		System.out.println(hong); //밑에랑 같은 의미
		System.out.println(hong.toString()); //toString은 생략가능 편리하게 사용할수있음
		
		// 빈 값을 가진 객체를 생성하는경우
		Person kim = new Person();
		
		
		
	}

}
