package reviewFinal;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// % 나머지 연산
		// and, or
		int a = 10;
		int b = 3;
		
		String str = "홍길동";
		
		System.out.println(a>b && str == "홍길동"); //true
		// 이 경우 트루로 나오긴하지만 그냥 문자열은 무조건 이퀄스로 비교하자
		
		String str2 = new String("홍길동");
		
		System.out.println(a>b && str2 == "홍길동"); //false 
		
		
		System.out.println(a<b || str.equals(str2)); //true
	
		System.out.println((double)(a/b)); // 계산 후에 타입변환해서 3.0
		System.out.println(((double)a/b)); // 타입 변환 후 계산해서 3.33
	}

}
