package extendQuiz;

public class Laptop extends Computer {
	private double kg;
	
	public Laptop(String brand, double kg) {
		super(brand); // 브랜드 변수를 가져오기 위해 부모클래스의 생성자 호출
		this.kg = kg;
	}
	
	public void printSpecs() {
		System.out.println(getBrand() + " 브랜드의 " + kg + "kg 노트북");
	}

	public double getKg() {
		return kg;
	}
	
}