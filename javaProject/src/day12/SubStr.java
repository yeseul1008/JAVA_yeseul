package day12;

import java.util.Scanner;

public class SubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Java Prigraming";
		System.out.println(word.substring(1));
		
		System.out.println(word.substring(5, 12));
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오: ");
		String input = s.next();
		for(int i = 0; i<input.length();i++) {
			String first = input.substring(0, 1);
			String aa = input.substring(1) + first;
			System.out.println(aa);
			input = aa;
		}
		
	}

}
