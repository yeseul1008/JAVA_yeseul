package review_day1;

public class Operator5 {

	public static boolean Oddcheck (int num) {
		if(num % 2 == 1) {
			System.out.println(num +"는 홀수입니다");
			return true;
		} else {
			System.out.println(num +"는 짝수입니다");
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > num2 | num1 % 2 == 1);
		// | 하나만 사용하면 뒤에 경우까지 참인지 거짓인지 확인한다
		//// || 두개 사용하면 앞에 경우만 참인지 거짓인지 확인한다
		
		System.out.println(num1 > num2 || Oddcheck(num1)); // ||니까 앞만 확인하고 뒤에 메소드는 출력안함
		System.out.println(num1 > num2 | Oddcheck(num1)); // | 니까 둘다 확인하기때문에 뒤에 메소드가 출력됨
	}

}
