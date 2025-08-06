package day15;

public class SrtingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "show Me The Money";
		
		for (int i = 0; i < str.length(); i++) {
			// 캐릭터를 문자열로
			String word = Character.toString(str.charAt(i));
			// 문자열을 소문자로
			System.out.println(word.toLowerCase()); // 스트링에서 0번째 인덱스 값 출력
		}

	}

}
