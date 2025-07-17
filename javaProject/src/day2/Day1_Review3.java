package day2;

public class Day1_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자 ( ++, -- )
		int num1 = 5;
		num1++; //6 (num1 = num1 + 1)과 같다
		++num1; //6 이 상태에선 같은 결과를 리턴함 
		
		int num2 =3;
		// 후위연산자 (++, --가 뒤에 붙었을 때)
		int num3 = num2++; // 다른 변수에 담을땐 다른 결과가 나타난다
		// 본인의 값 (num2)를 먼저 num3에 넣고 그다음 본인의 값(num2)를 1 증가
		//  num2 = 4, num3 =3
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		
		// 선위연산자(++,--가 뒤에 붙었을 때)
		//본인의 값(num4)를 먼저 1증가시키고, num5에 넣는다.
		int num4 =3;
		int num5 =++num4;
		// num4 = 4, num5 = 4
		System.out.println("num4: " + num4);
		System.out.println("num5: " + num5);
	}

}
