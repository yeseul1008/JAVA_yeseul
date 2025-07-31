package review_day3;

public class Fruit {

	private String name;
	private String color;
	private int price;
	
	//get: 값을 가져오는 메소드
	//set: 값을 변경하는 메소드
	public void sell() {
		System.out.println(name + "를 판매했습니다.");
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		String status = "M"; //M이 관리자라고 가정
		if(!status.equals("M")){
			System.out.println("수정 권한이 없습니다.");
			return; // 리턴은 이 코드 이후 바로 빠져나가는용도. return 10 같이 값이 있는거 아니면 void와 같이 쓸수잇음
		}
				
		if(price <=0) {
			System.out.println("가격을 다시 확인해주세요");
		}
		this.price = price;
	}
	
}
