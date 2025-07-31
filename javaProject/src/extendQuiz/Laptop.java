package extendQuiz;

public class Laptop extends Computer {
	private double kg;
	
	public Laptop(String brand, double kg) {
		super(brand);
		this.kg = (int) kg;
	}
	
	public void printSpecs() {
		System.out.println(getBrand() + "브랜드의 " + kg + "kg 노트북");
	}
	
}