package day1;

public class Operator2 {

	public static void main(String[] args) {
		//증감 연산자
		// ++, --
		int num = 10;
		
//		num++; // num = num + 1; 과 같은 의미
//		System.out.println(num); // 11출력
//		
//		num--;
//		System.out.println(num);

		int num2 = 10;
		++num2;
		System.out.println(num2);
		--num2;
		System.out.println(num2);

//		int num3 = 10;
//		int num4 = num3++; // 수를 넣고 그 후에 num3을 1만큼 증가시킨다
//		System.out.println(num4);
//		System.out.println(num3);

//		int num3 = 10;
//		int num4 = num3++; // 수를 넣고 그 후에 num3을 1만큼 증가시킨다
//		System.out.println(num4);
//		System.out.println(num3);
		
//  가 앞에있던 뒤에있던 그 당사자는 무조건 증가,감소한다
		
		int a = 3;
		int b = 5; 
		b = a++;// a=4, b=3
		int c = ++b; // b=4, c=4
		int d = ++a; // a= 5
		

		
	}

}
