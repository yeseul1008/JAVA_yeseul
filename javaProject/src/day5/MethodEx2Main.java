package day5;

public class MethodEx2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx2 m = new MethodEx2();
		m.sum(1, 5);
		m.sum(3.5, 2.5);
		m.sum(1.5, 4);
		m.sum(3, 5, 9);
		
		// 오버로딩: 타입이 다른 모든 경우마다 메소드를 만들고 호출하기 힘드니 메소드는 같은이름의 메소드를 여러개 만들 수 있다
		
		// 조건: 매개변수의 타입이 다르거나 개수가 다를때만 동일한 이름으로 메소드를 만들 수 있다
	}

}
