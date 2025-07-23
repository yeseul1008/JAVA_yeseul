package day6;

import java.util.Arrays;

public class ValueAndRef2 {
	public static void main(String[] args) {

		int a = 10;
		int b = a;
		b = b + 3;
		System.out.println(a); // 10

		int arr[] = { 1, 2, 3, 4, 5 }; // arr => 10sfj124
		int copyArr[] = arr; // arr => 10sfj124, copyarr => 10sfj124
		copyArr[2] = 10000; // 10sfj124 주소에 있는 2번째 인덱스의 값을 10000으로 바꿔라
		System.out.println(Arrays.toString(arr)); //[1, 2, 10000, 4, 5]
		
		/// 따라서 arr, copyarr은 같은 주소를 공유하고 있기 때문에 한쪽에서 수정하면 다른 쪽에 동일하게 영향을 받는다.
	}
}
