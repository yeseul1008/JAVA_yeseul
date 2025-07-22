package day5;

public class Calculator {
	
	//메소드
	// 메소드 앞에 void 타입이 있으면 되돌려주는 값이 없는 타입
	void intro() {
		System.out.println("계산기 입니다!");
	}
	
	// 메소드 앞에 int,String,double 등 타입이 있으면 해당 타입의 값을 되돌려준다는것
	int returnNumber() {
		return 10; //return 뒤는 int타입 으로 동일해야함
	}
	
	//     (int x) -> int형 데이터를 받아야 함 (파라미터라고 부름)
	int sum(int x, int y) {
		return x + y;
	}
	// 더 큰 수를 리턴하는 max함수 메소드 
	int max(int x, int y) {
		if(x > y) {
			return x; // 메소드는 return을 만나면 밑 코드 진행안하고 바로 끝남
		}else {
			return y;
		}
		// return x > y ? x : y; 로도 가능
	}
	
	
	// 파라미터로 배열을 받을 수 도 있음
	//               arr -> 꼭 받을 객체 이름과 이름이 같지 않아도됨 ex) int arrSum(int[] abc)여도 잘 작동
	int arrSum(int[] arr) {
		//배열을 파라미터로 받아서 모든 값을 더한 후 리턴하는 메소드
		int sum =0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	void intro2(String name, int age, double height) {
		System.out.println(name + "님의 나이는 " + age + " 키는 " + height + " 입니다" );
	}
}


