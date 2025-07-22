package day5;

public class Calcmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Calculator 클래스를 이용해서 clac이라는 이름의 객체 생성
		Calculator calc = new Calculator();
		calc.intro();
		
		int number1 = calc.returnNumber(); //리턴타입이 있는 메소드를 호출할 땐 그 타입의 변수에 담아줘야함
		System.out.println(number1);
		//===============
		int number2 = calc.sum(20,5); //calc 메소드에 10을 보내줘서 리턴받은 값을 num2에 담음 
		System.out.println(number2);
		
		int max = calc.max(5, 8);
		System.out.println(max);
		
		int arr[] = {3,5,1,4,2};
		int arrSum = calc.arrSum(arr);
		System.out.println(arrSum);
		
		calc.intro2("홍길동", 30, 170.9);
	}

}
