package review_day3;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong; // 변수 선언
		hong = new Human("홍길동",30,"인천", 10000); // 객체 생성
//		Human hong = new Human(); // 과 같음 
		
//		int a;
//		a = 10;
		// a에 int형 변수만 넣을 수 있듯이 홍에는 휴먼으로 생성한것을 
		
//		hong.name = "홍길동";
//		hong.eat();
		hong.money = 100000;
		
//		Human kim = new Human("김철수",20,"서울",20000);
//		kim.name = "김철수";
		System.out.println(hong.money);
		
		//// 휴먼 클래스로 여러개의 객체를 생성함. 서로 다른 존재
	
		Human park = new Human("박영희",20000); // 이름, 소유금액
		Human yu = new Human("유재석",40,"제주도"); // 이름, 나이, 주소
		
		System.out.println(park.money);
		System.out.println(yu.addr);
		
	
	}

}
