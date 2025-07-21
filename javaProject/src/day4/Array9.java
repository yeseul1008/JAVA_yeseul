package day4;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "자바", "오라클", "html/css", "js", "jsp" };
		// 스캐너로 입력받아서 해당 과목이 있으면 '있다' 출력, 없으면 '없다' 출력
		Scanner s = new Scanner(System.in);
		System.out.print("과목을 입력하세요: ");
		String subject = s.next();
//		int a = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].equals(subject)) { // 숫자의 비교는 ==로 할 수 있음. 문자의 비교는 저 방식을 써야함(객체의 주소가 아닌 문자열 이름만 비교하는것)
//				System.out.println("있다");
//				a++;
//			}
//
//		}
//		if(a!=1){
//			System.out.println("없다");
//		}

		// 다른 방법
		boolean flg = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(subject)) {
				flg = true;
				break;
			}
		}

		if (flg) { //flg == true
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		
//		String result = flg ? "있다" : "없다";
//		System.out.println(result);
		// 위 이프문이랑 같은 역할

//		}
//	String sub = "자바";
//	String sub2 = "자바";
//	if(sub.equals(sub2)) -> true나옴
//	if("자바".equals(sub2)) - > true 나옴
	}

}
