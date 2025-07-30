package review_day2;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qqq = MethodEx.testA(); //리턴 타입 String이므로 String 변수에 저장함
		System.out.println(qqq);
		
//		String www = MethodEx.testB(); // 리턴이 없는 메소드 이므로 저장 불가
		MethodEx.testB(); 
	
		int a = 10;
//		MethodEx.testC(a); // 웬만해선 리턴이 없는 경우
		int b = MethodEx.testC(a); // 리턴이 있는 경우( 숫자를 하나 받아야함 )
		
		double c = MethodEx.testD(a, 1.5);
		System.out.println(c);
		
		int testArr[] = {1,2,3,4,5};
		int d = MethodEx.testE(testArr);
		System.out.println(d);
		
	}

}
