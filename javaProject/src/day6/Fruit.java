package day6;

public class Fruit {
	private String name;
	private int price; // 이 클래스 안에서만 접근가능

	Fruit(String name, int price) {
		this.name = name;
		this.price = price; // 이 클래스 안에서만 접근가능
	}

	void info() {
		System.out.println(name + "의 가격은 " + price + " 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	int getPrice() {
//		return price;
//	}
//
//	void setPrice(int price) {
//		if (price <= 0 || price >= 100000) {
//			System.out.println("가격을 다시 확인해주세요");
//		} else {
//			this.price = price;
//		}
//	}	// 간접접근은 메소드에서 제어가 가능함 (권한확인해서 접근을 허용하는 등..)

	

}
