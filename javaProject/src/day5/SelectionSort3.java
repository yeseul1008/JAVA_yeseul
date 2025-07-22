package day5;

public class SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 1, 5, 2 };
		for(int i =0; i <arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1;i<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					
				}
			}
			int temp = arr[i];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}
