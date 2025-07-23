package day6;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student hong = new Student(1234,"홍길동"); // 생성자
		Student yu = new Student(1357, "유재석", "컴퓨터학과"); // 생성자
		
		hong.setInfo(20, "남성");
		System.out.println(hong.getAge());
		yu.stuInfo();
		
		
	}

}
