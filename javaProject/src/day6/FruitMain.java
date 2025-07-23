package day6;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit banana = new Fruit("바나나", 1000);
		
		banana.setPrice(2000); // 프라이빗이여도 메소드를 통해서 간접접근 할수있음
	
		
		int price = banana.getPrice(); // 프라이빗이여도 메소드를 통해서 간접접근 할수있음
		System.out.println(price);
		

	}

}
