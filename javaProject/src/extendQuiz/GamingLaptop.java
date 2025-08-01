package extendQuiz;

public class GamingLaptop extends Laptop { //변수 더 추가된 랩탑 상속받기
private String graphic;

public GamingLaptop(String brand, double kg, String graphic) {
	super(brand, kg);
	this.graphic = graphic;
	
}
// 오버라이딩
public void printSpecs() {
	System.out.println(getBrand() + " 브랜드의 " + getKg() + "kg "+graphic+"게이밍 노트북");
}
}
