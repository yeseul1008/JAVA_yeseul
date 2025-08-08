package reviewFinal;

public class Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, 170.5); // 부모
		hong.eat(); 
		Student kim = new Student("김영희", 10, 24.4, 1234); // 자식
		kim.eat();
		
		Person p[] = new Person[3];
		p[0] = hong;
		p[1] = kim;
		
		Student s[] = new Student[3]; //자식클래스
		s[0] = kim;
//		s[1] = hong; //부모클래스로 만든걸 자식클래스로 만든거에다가 넣을수없음
//		s[1] = (Student)hong; // 다운캐스팅하면 가능
		
		Student kim2 = new Student("김영희", 10, 24.4, 1234);
		System.out.println(kim == kim2); // 주소가 다르기 때문에 false로 나온다
		
		// 이름, 나이, 키가 모두 동일하다면 같은사람으로 인정
		// Student 클래스에 equals 메소드를 오버라이딩 해서 구현
		System.out.println(kim.equals(kim2));
//		kim.equals(kim2)
		
	}

}
