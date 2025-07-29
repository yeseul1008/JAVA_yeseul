package review_day1;

public class Loop_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("(" + i + "," + j + ")");
//			
//			}
//			System.out.println();
//		}
		
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("(" + i + "," + j + ")");
			}System.out.println();
		}
		System.out.println("-------------------------");
		
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j<=6-i; j++) {
				System.out.print("(" + i + "," + j + ")");
			}System.out.println();
		}
	}

}
