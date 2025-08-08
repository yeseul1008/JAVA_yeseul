package reviewFinal;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int, double, char(한글자), boolean
		// String 
		int a = 0; // 일반타입
		Integer a1 = 0; // 래퍼클래스를 이용하면 일반타입도 메소드 사용할수있다.
		
		String b = "Hallo"; // 객체
		b.length(); // 객체이니까 변수와 메소드를 가지므로 .을 통해 메소드 사용가능함
		
		String strNumber = "10";
		int number = Integer.parseInt(strNumber);// 파스인트 메소드를 통해 문자열을 숫자로 바꿀 수 있음
		// int number = (int)strNumber 이건 안됨 
		
		
	}

}
