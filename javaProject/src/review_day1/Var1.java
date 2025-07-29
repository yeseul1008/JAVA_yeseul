package review_day1;

public class Var1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30; // 정수 => long(21억 이상의 숫자의 경우 사용)
		double height = 170.5;
		boolean isMarried = true; // true or false
		char gender = 'M';
		
		String name = "TeST"; //String 클래스로 name 객체 생성
		System.out.println(name.toUpperCase()); // name 객체의 메소드 사용
		
		String name1 = "홍길동"; 

		if (age == 30) {
			System.out.println("30 맞다");
		}
		if(name1 == "홍길동") { // 문자열에서는 "==" 쓰지 말것, String은 클래스이기 때문이다 
			System.out.println("홍길동이다");
		}
		if(name1.equals("홍길동")) {
			System.out.println("홍길동이다");
		}
		
		String f = "1";
		int g = Integer.parseInt(f); // 문자열을 int형으로
		System.out.println(g+1);
	}

}
