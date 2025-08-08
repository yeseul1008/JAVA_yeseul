package reviewFinal;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문
		// 삼항연산자
		
		int arr[] = {1,5,2,4,6,8};
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int num : arr) {// 변수 i에 순차적으로 arr에 있는 요소가 들어가면서 반복
			System.out.print(num + " ");
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Random ran = new Random();
		for(int i = 0; i<10; i++) {
			map.put(ran.nextInt(10)+1, ran.nextInt(10)+1);
		}
		System.out.println(map);
		for(int key : map.keySet()) { // key 값만 뽑아오기
			System.out.println(key + " ");
		}
		
		// 숫자 하나 입력받아서 10보다 크면 '큰 수' 출력 작으면 '작은 수' 출력
		Scanner s = new Scanner(System.in);
		if(s.nextInt()>10) {
			System.out.println("큰수");
		} else {
			System.out.println("작은 수");
		}
		// 조건 ? true일떄 리턴 : false일때 리턴;
		String str = s.nextInt() > 10 ? "큰 수" : "작은 수"; //s.nextInt() > 10가 참이면 "큰 수" 리턴 아니면 "작은 수" 리
		System.err.println(str);
	}
}
