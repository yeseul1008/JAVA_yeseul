package review_day3;

public class Book_Test {
	String title; // 책 제목
	String author; // 저자
	int price; // 가격

	Book_Test() {
//		this.title = "제목 없음";
//		this.author = "저자 미상";
//		this.price = 0;
		this("제목없음", "저자미상", 0); // 이렇게해도 됨
		
	}

	Book_Test(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void bookInfo() {
		System.out.println("책 제목: " + title + ", 저자: " + author + ", 가격: " + price);
	}

	public void setInfo(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void discount(int money) {
		if (money > price) {
			System.out.println("할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.");
			this.price = 0;
		} else {
			this.price -= money;
		}
	}

	public int getPrice() {
		return price;
	}
}
