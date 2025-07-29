package review_day1;

public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		while (i <= 5) {
			int j = 1; // 초기화를 위해 위치 중요
			while (j <= 5) {
				
				System.out.print("(" + i + "," + j + ") ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
