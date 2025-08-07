package quizEx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이", 3);
        dog.sound();  // 출력: 멍멍
        Animal an = new Animal("초코", 4);
        an.sound();
        
//		5. ArrayManager 클래스를 작성하시오.
//		 조건 1. int형 배열을 매개변수(인자)로 받아서 두번째로 큰 숫자를 리턴해주는 함수를 작성하시오.
//		 조건 2. 함수 호출 시 랜덤한 5개의 숫자 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
//		        단, 랜덤한 숫자는 홀수이면서 1~30사이의 값이어야 함.
//		 조건 3. 모든 메소드는 ststic으로 선언할 것.
//		 조건 4. 외부함수 사용에 대한 제약 없음.
        
        int[] arr = {4,5,2,3,1,8,3,4,1,6,5};
        int a = ArrayManager.twoReturn(arr);
        System.out.println(a);
        
        System.out.println(Arrays.toString(ArrayManager.returnArr()));
    }
}
