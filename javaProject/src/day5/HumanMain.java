package day5;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천"); // 휴먼 클래스로 홍이라는 이름의 객체생성
	//	hong.name = "홍길동"; // 홍 객체의 name 변수에 '홍길동' 부여
		hong.eat(); //eat 메소드 호출함
		System.out.println(hong.name); //hong은 주소를 가짐
		
		
		Human kim = new Human("김철수", 25, "서울"); // 휴먼 클래스로 김이라는 이름의 객체 생성
	//	kim.name = "김철수"; // 홍 객체의 name 변수에 '김철수' 부여
		kim.study(); // study 메소드 호출함
		System.out.println(kim.name);
		
		Human park = new Human("박영희", 20);
		park.eat();
		
	}

}
