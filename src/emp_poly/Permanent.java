package emp_poly;

public class Permanent extends Employees{
	
	public Permanent(String empNo, String ename, int salary) {
		super(empNo, ename, salary);
		
	}

	@Override
	public int paidSalary() {
		
		return super.getSalary();
	}

	@Override
	public String toString() {
		return super.toString() + ", Permanent [paidSalary()=" + paidSalary() + ", getEname()=" + getEname() + ", getEmpNo()=" + getEmpNo()
				+ ", getSalary()=" + getSalary() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
	

}
