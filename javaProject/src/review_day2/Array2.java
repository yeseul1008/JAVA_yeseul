package review_day2;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,5,2};
		int sumArr= ArrayFunc.sum(arr);
		System.out.println("배열 합: " + sumArr); // 배열안 값들 총합 출력
	
		int num = ArrayFunc.indexValue(arr,2);
		System.out.println(num); // 두번째 파라미터로 보낸 값만큼의 위치 리턴
		
		double avg = ArrayFunc.avg(arr);
		System.out.println(avg); // 배열안 전체 평균 값 출력
		
		boolean isFlg = ArrayFunc.searchValue(arr, 3);
		System.out.println(isFlg); // 두번째 파라미터로 보낸 값이 배열 내에 존재하면 트루, 없으면 폴스 리턴
	
	}

}
