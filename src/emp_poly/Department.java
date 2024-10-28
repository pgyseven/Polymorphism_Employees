package emp_poly;

import java.util.ArrayList;

public class Department {
	private int deptNo;
	private String deptName;
	private ArrayList<Employees> empList = new ArrayList<Employees>();
	
	// Aggregation 관계 : 부서 객체가 소멸되어도 empList는 소멸 되지 않음
	public Department(int deptNo, String deptName, ArrayList<Employees> empList) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.empList = empList;
	}
	
	// Composition 관계 : 부서 객체가 소멸되면, 직원 목록 empList도 함께 소멸
	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.empList = new ArrayList<Employees>();
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}
	
	//사원을 부서에 배치하는 메서드
	public void addEmployees(Employees e) {
		this.empList.add(e);
	}
	
	// 부서 정보와 부서에 소속된 사원들을 출력하는 메서드
	public void outputEmployees() {
		System.out.println(this.deptNo + ", " + this.deptName);
		
		for(Employees e : this.empList) {
			System.out.println(e.toString());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
