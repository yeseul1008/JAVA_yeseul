package day5;

public class Day4_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,1,4,2};
		int min = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 작은 값: "+min);
	}

}
