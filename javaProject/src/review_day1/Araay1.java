package review_day1;

import java.util.Arrays;
import java.util.Random;

public class Araay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subjectArr[] = {"java", "oracle", "html", "javascript", "jsp"};
		int scoreArr[] = {90, 85, 60, 95, 100};
		
//		for(int i = 0; i<subjectArr.length; i++) {
//			System.out.print("과목명: " + subjectArr[i] + ", ");
//			System.out.println("점수: " + scoreArr[i]);
//		}
//		
//		Object obj[] = {1, 1.5, "홍길동", true, new Random()}; // Object 는 모든 클래스의 부모 클래스라서 다 포괄가능하다.
		
//		int arr[] = new int[3]; //{0,0,0}
		
		// 점수가 평균을 넘는 과목들을 출력
		int sum = 0;
		int count = 0;
		// 평균구하기
		for (int i = 0; i <scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		System.out.print("평균이 넘는 과목은 ");
		double avg = ((double)sum/scoreArr.length);
		// 넘는 과목 수 구하기
		for(int i = 0; i <scoreArr.length; i++) {
			if (scoreArr[i]>avg) {
				System.out.print(subjectArr[i] + " ");
				count++;
			}
		}
		System.out.print("입니다");
		
		
		// String subSte = ""; 이렇게 공백 객체 만들고 이 객체 안에 반복문을 이용해서 평균넘는 과목들 넣고 나중에 출력
		// 하는 방법도 가능
		
		
//		String arr[] = new String[count];
//		int index = 0;
//		for (int i = 0 ; i <scoreArr.length; i++) {
//			if (scoreArr[i]>avg) {
//				arr[index] = subjectArr[i];
//				index++;
//			}
//		}
//		
//		for (int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.print("입니다");
	}

}
