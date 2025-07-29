package review_day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 수(1~10) 5개를 배열에 넣고 사용자로부터 입력받은 숫자가 배열에 존재하면 "맞췄다" 없으면 "틀렸다" 
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		boolean flg = false;
		int arr[] = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			}

		System.out.print("숫자를 입력하시오: ");
		int input = s.nextInt();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == input) {
				System.out.println("맞췄다");
				flg = true;
				break;
		}

		}
		if(flg==false) {
			System.out.println("틀렸다");
		}
		System.out.println(Arrays.toString(arr));
	}

}
