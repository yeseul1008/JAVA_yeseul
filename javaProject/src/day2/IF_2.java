
package day2;

public class IF_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// else if 
		// if ~ else 조건문보다 더 세분화 조건이 3개이상
		// 점수 75
		int score = 75;
		
		if (score >=90) {
			System.out.println("A 학점!");
		}
		else if (score >= 80){
			System.out.println("B 학점!");
		}
		else if (score >= 70){
			System.out.println("C 학점!");
		}
		else if (score >= 60){
			System.out.println("D 학점!");
		}
		else {// TODO 모든 조건을 만족하지 않을때를 그냥 else를 사용한다. 필수는 아님
			System.out.println("F 학점");
		}
		
		System.out.println("종료");
	}

}
