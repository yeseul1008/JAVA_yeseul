package day4;

public class Array11 {
	public static void main(String[] args) {
		
		//배열에 있는 값들을 절대값을 기준으로 가장 큰 숫자 찾기
		int arr[] = {3, 5, -15, 10, -8};
		int max = 0;
		for(int i=0;i<arr.length; i++){
			arr[i] = Math.abs(arr[i]);
			if(max<arr[i]) {
				max = arr[i];
			}
		//	max = Math.abs(arr[i]) > max ? Math.abs(arr[i]) : max; 랑 같음
		}
	
		System.out.println("가장 큰 수는: "+ max);
		
		
	}

}
