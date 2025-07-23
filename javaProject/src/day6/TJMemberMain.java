package day6;

public class TJMemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TJMember hong = new TJMember("홍길동", 30, "20251234", 10000);
		hong.money += 50000;
		hong.classMoney += 10000;
		
		TJMember kim = new TJMember("김철수", 25, "20254321", 30000);
		kim.money = kim.money = 10000;
		kim.classMoney += 10000;
		
		TJMember park = new TJMember("박영희", 20, "20259898", 100000);
		park.classMoney += 10000;
		
		System.out.println(park.money);
		System.out.println(park.classMoney);
		TJMember.classMoney -= 5000;
		System.out.println(TJMember.classMoney); // 스테틱은 클래스 이름으로도 접근가능함 
		TJMember.test();
		
		//========
		// math클래스는 모든 요소들을 ststic으로 선언해놨음
		// 따라서 클래스명으로 PI, abs(), max() 등의 멤버에 접근이 가능하다.
		int a = Math.abs(-10); // 얘도 클래스 이름으로 직접 접근했으므로 스테틱을 사용한것
	}
	

}
