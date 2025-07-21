package day4;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		// 변수 하나에 여러개의 수 저장
		// 같은 데이터 타입끼리만 가능
//		int arr[] = new int[5]; // 저장공간 5개짜리 배열 생성
		//arr 변수에 5개 수 저장 가능
//		arr[0] = 10;
//		arr[3] = 30;
		
//		int arr[] = new int[5]; // { 0,0,0,0,0 }
//		arr[1] = 5; //{ 0,5,0,0,0 }
//		arr[4] = 10; // { 0,5,0,0,10 }
//		System.out.println(arr[1]); // 배열에서 두번째 값 출력
		
		int arr[] = {1,3,5,2,4};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

//		for(int i = 0; i<=4; i++) {
//			System.out.println(arr[i]);
//		}
		//             배열의 길이에 따라 할 수 있음 5
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
