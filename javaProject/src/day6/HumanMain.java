package day6;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, 170.1);
//		hong.name = "길동이"; name이 프라이빗이라 접근불가
		hong.age = 31; // 아니니까 접근가능
		Human kim = new Human("김철수", 25);
		Human park = new Human("박영희");
	}

}
