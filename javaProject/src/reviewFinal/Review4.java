package reviewFinal;

import java.util.Arrays;

import exam0807.Student;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "java", "oracle", "html", "javascript", "jsp" };
		int[] leg = new int[arr.length];
		// 가장 길이가 긴 문자 출력
		String longStr = "";
		for (int i = 0; i < arr.length; i++) {
			if (longStr.length() < arr[i].length()) {
				longStr = arr[i];
			}
		}

		System.out.println(longStr);

		Student stuArr[] = new Student[5];
		stuArr[0] = new Student("홍길동", 30, "인천", 1234, 1);
		
	}

}
