package review_day3;

public class Employee {
	int empId; //사번
	String empName; // 이름
	String department; // 부서
	int salary; // 급여
	String position; // 직급

	// 사번, 이름
	Employee(int empId, String empName) {
	this(empId, empName, "");
	}
	// 사번, 이름, 부서
	Employee(int empId, String empName,String department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public void setDetails(int salary, String position) {
		this.salary = salary;
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}
	
	public void empInfo() {
		System.out.println(empName + " 사원의 사번은 " + empId + ", 직급은 " + position + ", 급여는 "+salary + "원 입니다.");
	}
}
