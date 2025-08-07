package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class WordQuiz {
	
	public static ArrayList<HashMap<String, String>> quizList(){
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = {
			    "멕시코", "스페인", "프랑스", "영국", "그리스", 
			    "독일", "중국", "러시아", 
			    "일본", "대한민국", "이탈리아", "캐나다", "브라질", 
			    "인도", "이집트", "호주", "터키", "노르웨이"
		};
		String[] values = {
			    "멕시코시티", "마드리드", "파리", "런던", "아테네", 
			    "베를린", "베이징", "모스크바", 
			    "도쿄", "서울", "로마", "오타와", "브라질리아", 
			    "뉴델리", "카이로", "캔버라", "앙카라", "오슬로"
		};
		
		for(int i=0; i<keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		// 문제는 중간에 종료하지 않으면 최대 10문제까지 출력
		// 중복은 있으면 안됨
		// 한문제당 10점
		// 최종 몇점인지 출력(중간에 종료하지 않았을 경우)
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		// 1. quizList() 메소드 호출을 통해 18개의 문제가 담긴 리스트 리턴 받기
		//    리턴 타입은 리스트안에 맵이 담긴 형태 (ex [{대한민국:서울}, {영국:런던}, {프랑스:파리} ... ]
		ArrayList<HashMap<String, String>> quizList = quizList();// 해시맵을 담는 리스트
		
		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");
		
		// 2. 중복된 문제 방지를 위해 출제된 문제의 index를 보관할 map 생성
		HashMap<Integer, Integer> keyTable = new HashMap<>(); //문제의 인덱스 보관 전용 맵
		while(true) {
			// 3. 랜덤한 문제 출제를 위해 리스트에 랜덤으로 접근하기 위해 랜덤한 숫자 생성
			int ranNum = ran.nextInt(quizList.size());
			
			// 4. 이부분은 아래 코드 5번을 이해하고 올라와서 확인해보길 권장
			//    keyTable에 랜덤하게 뽑은 숫자의 키가 있다면 더이상 진행하지 말고 반복문 맨 위로 다시 이동(continue)
			//    ex) ranNum이 10인데 이미 keyTable에 키가 10인 값이 있다면 문제를 출제하지 말고 맨위로 다시 이동
			if(keyTable.containsKey(ranNum)) {
				continue;
			}
			
			// 5. 출제한 문제를 다시 출제하지 않도록 keyTable에 기록
			//    만약 ranNum이 10이면 {10 : 0} 형태로 keyTable에 저장
			//    이후 새로운 문제 풀이 시 4번 과정에서 해당 키가 있는지 확인
			keyTable.put(ranNum, 0);
			
			// 6. 랜덤한 숫자에 해당 하는 map 가져오기
			//    ex) ranNum이 10이면 quizList에 10번째 index에 있는 map을 quiz에 넣기
			//        quiz는 {대한민국:서울} 이런 형태의 맵이 될 것
			HashMap<String, String> quiz = quizList.get(ranNum); //하나만 빼오는 해시맵
			String country = "";
			String capital = "";
			
			// 7. quizList에 있는 키 값들은 모두 다르기 때문에 keySet 메소드를 이용해서 키 값을 얻어온 후
			//    key 값을 country에, value값을 capital에 저장
			//    quiz = {대한민국 : 서울} 이라면 country에 대한민국, capital에 서울이 저장
			for(String key : quiz.keySet()) {
				country = key;
				capital = quiz.get(key);
			}
			
			// 8. country에 있는 문제 출제
			System.out.print("[" + country + "] 의 수도는? >> ");
			String answer = s.next();
			
			// 9. -1이 입력되면 루프 빠져나가기 (종료)
			if(answer.equals("-1")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if(answer.equals(capital)) { // 10. 사용자가 답변한 값과 capital이 같으면 정답
				System.out.println("정답!");
			} else { // 11. 다른 답을 입력했으면 오답
				System.out.println("오답 ! 정답은 : " + capital);
			}
		}
		
	}
}