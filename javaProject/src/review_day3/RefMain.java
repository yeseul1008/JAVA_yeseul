package review_day3;

import java.util.Arrays;

public class RefMain {

	public static int[] retrunArr(int[] arr) {
		// 배열을 파라미터로 받아서 0번째 인덱스 값을 1000으로 변경
		arr[0] = 1000;
		return arr;
	}
	public static void voidArr(int[] arr) {
		arr[0] = 1000;		
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
//		Human hong = new Human("홍길동", 30, "인천", 10000);
//		hong.money = 1000000;
//		Human kim = new Human("김철수", 25, "서울", 5000);
//		System.out.println(kim.money);
//		
//		Human park = hong; //박은 홍의 주소를 바라보게됨(공유)
//		park.name = "박영희"; // 박의 이름을 바꿔도 같은 주소이기 때문에 홍의 이름도 박영희가 됨
//		
//		System.out.println(hong.name);
//		System.out.println(park.addr);
		
		int arr[] = {1,3,5,2,4};
//		arr = retrunArr(arr);
		voidArr(arr);
		System.out.println(Arrays.toString(arr));
	} 

}
