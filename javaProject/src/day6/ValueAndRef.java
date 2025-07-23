package day6;

public class ValueAndRef {

	void vlaueTest(int x) {
		x = x + 1;
	}
	int vlaueTest2(int x) {
		return x + 1;
	}
	// void vlaueTest(int aaa) {
	// aaa = aaa + 1;
	// }
	// 해도 똑같은 메소드이기 때문에 그냥 메인에서 복사된 값을 넣은것 뿐이라 보낸 값에 영향을 주지않고 출력은 10이 된다

	void refTest(int[] arr) {
		//arr = 0x1234(주소)
		arr[2] = 10000;
	}
}
