package day6;

import java.util.Arrays;

public class ValueAndRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueAndRef v = new ValueAndRef();
		int x = 10; ///[1대1]
		v.vlaueTest(x);
		System.out.println(x);
		
		
		x = v.vlaueTest2(x);
		System.out.println(x);
		
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr);
		v.refTest(arr); /// 0x1234(주소)를 보낸것임 [객체는주소를 가리키기 때문에 주소를 보낸다]
		System.out.println(Arrays.toString(arr));
		
		// 주소를 보낸 것이기 때문에 값이 바뀌어서 출력됨 [1, 2, 10000, 4, 5]
	}

}
