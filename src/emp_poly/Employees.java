package emp_poly;

public abstract class Employees {
   private String empNo;
   private String ename;
   private int salary;
   
   Employees(String empNo, String ename, int salary) {
      super();
      this.empNo = empNo;
      this.ename = ename;
      this.salary = salary;
   }

   public String getEmpNo() {
      return empNo;
   }

   public String getEname() {
      return ename;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }
   
   public void setSalary(int salary) { // 
      this.salary = salary;
   }
   
   public int getSalary() {
      return salary;
   }

   public abstract int paidSalary();

   @Override
   public String toString() {
      return "Employees [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
   }
   
   
}
