package emp_poly;

public class PrTimer extends Employees {
	private int workTime; //일한 시간
	private int payPerWork; //시급
	
	
	
	public PrTimer(String empNo, String ename, int salary, int workTime, int payPerWork) {
		super(empNo, ename, salary);
		this.payPerWork = payPerWork;
		this.workTime = workTime;
		
	}



	@Override
	public int paidSalary() {
		super.setSalary(this.payPerWork * this.workTime);
		return super.getSalary();
		
	}



	@Override
	public String toString() {
		this.paidSalary();
		return super.toString() + ", PrTimer [workTime=" + workTime + ", payPerWork=" + payPerWork + "]";
	}
	
	

}
