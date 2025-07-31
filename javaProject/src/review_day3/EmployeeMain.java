package review_day3;

public class EmployeeMain {

	public static void main(String[] args) {


//		kim 객체 생성 (이름: 김철수, 사번: 1001)
//		park 객체 생성 (이름: 박영희, 사번: 2002, 부서: 인사부)
//		kim 객체에 setDetails로 값 설정 (급여: 3000000, 직급: 대리)
//		kim 객체의 getSalary() 호출 결과 출력
//		park 객체에서 empInfo() 호출
		
		Employee kim = new Employee(1001, "김철수");
		Employee park = new Employee(2002, "박영희","인사부");
		
		kim.setDetails(3000000, "대리");
		
		System.out.println("김철수 급여:" + kim.getSalary());
		
		kim.empInfo();
		park.empInfo();
	}

}
