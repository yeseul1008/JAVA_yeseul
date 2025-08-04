package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradeMapoptimization {
	
	public static int scoreFunc(String subject, int max) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.println(subject + ">>");
			score = s.nextInt();
			if(score<0 || score > max) {
				System.out.println(subject+"의 범위는 0부터 "+max+"까지 입니다.");
			}else {
				break;
			}
		}
		return score;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======성적관리 시스템======");
		System.out.print("인원 수 입력 : ");
		int num = s.nextInt();
		for (int i = 0; i < num; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 >> ");
			String name = s.next();
			map.put("name", name);

			map.put("java", scoreFunc("자바", 35));
			map.put("oracle", scoreFunc("오라클", 40));
			map.put("html", scoreFunc("html", 25));
			list.add(map);
			}
			
			System.out.println("-----------------");
		
		for (int i = 0; i < num; i++) {
			HashMap<String, Object> user = list.get(i);
			int sum = (int) user.get("java") + (int)user.get("oracle") + (int)user.get("html");
			System.out.println("이름 : " + user.get("name")+", 총점 : "+ sum);
		}
	}

}
