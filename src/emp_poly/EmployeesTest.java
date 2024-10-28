package emp_poly;

import java.util.ArrayList;

public class EmployeesTest {

	public static void main(String[] args) {
		
		ArrayList<Employees> empList = new ArrayList<Employees>();
		
		Department d1 = new Department(10, "Administration", empList);
		
		d1.addEmployees(new Permanent("1000", "dooly", 5000));
		d1.addEmployees(new PrTimer("1000", "douner", 0, 10, 20000));
		
		d1.outputEmployees();

	}

}
