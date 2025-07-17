package day1;

public class First { //클래스 이름을 식별자, 클래스는 대문자로 시작한다

	public static void main(String[] args) {
		//문자 String
		//숫자(정수) int 단, 21억이 넘는 수는 long
		//숫자(실수 소수점) double 
		//참 or 거짓 boolean
		
		String name = "홍길동";
		int age = 30;
		double height = 170.5;
		boolean married = false;
		
		System.out.println(name + 5); 
		System.out.println(age + 5);
		System.out.println("이름:" + name);
		System.out.println("이름:" + age +5); // 문자가 포함되있으면 다 문자로 판단되서 단순 이어붙이고 출력된다

		//위에서 선언한 변수를 이용하여 '홍길동의 나이는 30, 키는 170.5 입니다.' 출력
		
		System.out.println(name + "의 나이는 "+ age + ", 키는 "+ height + " 입니다.");	
		int age2;
		age2 = 35;
		System.out.println(age2);
		
		var ppp = 30; // var은 써도 되지만 적용안되는 경우가 있어 안쓴다
		System.out.println(ppp);
		
	}
	

}
