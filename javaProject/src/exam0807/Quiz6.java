package exam0807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//		그 후, 중복된 숫자가 3개이상인 수의 숫자와 개수를 출력하시오. (15점)
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 1은 4개, 2는 6개, 3은 4개 있으므로
//		' 1 => 4개
//		2 => 6개
//		3 => 4개
//		' 형태로 출력
		Random ran = new Random();
		int[] arr = new int[20];
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<HashMap<Integer, Integer>> arrList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int ranNum = ran.nextInt(10) + 1;
			arr[i] = ranNum;
			if (map.containsKey(arr[i])) { 
				map.put(arr[i], map.get(arr[i]) + 1); 
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		for(int key : map.keySet()) { 
			if(map.get(key) >= 3) {
				System.out.println(key + " => " + map.get(key) + "개");
			}
		}
	}

}
