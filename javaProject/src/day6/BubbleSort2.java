package day6;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,1,4,2};
		
		// 내림차순 {5,4,3,2,1,}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j <arr.length-1 ; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
