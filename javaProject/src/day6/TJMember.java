package day6;

public class TJMember {
	String name;
	int age;
	String stoNo;
	int money;
	static int classMoney; // 회비
	
	TJMember(String name, int age, String stuNom, int money){
		this.name = name;
		this.age = age;
		this.stoNo = stoNo;
		this.money = money;
	}
	
	static void test() {
		System.out.println("ststic 테스트");
	}
	
}
