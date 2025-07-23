package day6;

public class ReviewMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_Review hong = new Human_Review("홍길동", 30, 170.1);
		
		hong.intro();
//		이름 : 홍길동
//		나이 : 30
//		키 : 170.1

		String name = hong.getName();
//		이름 정보를 전달합니다.
		
		System.out.println(name);
//		홍길동
		
		System.out.println("==============");
		
		Human_Review kim = new Human_Review("김철수", 25, 180.5);
		kim.intro();
		String name1 = kim.getName();
		System.out.println(name1);
	}

}
