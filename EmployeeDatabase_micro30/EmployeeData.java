class EmployeeData {
  int empid;
  String empname;
  double salary;

  EmployeeData(int id, String name, double sal) {
    empid = id;
    empname = name;
    salary = sal;
  }

  public int getEmpid() {
    return empid;
  }

  public String getEmpname() {
    return empname;
  }

  public double getSalary() {
    return salary;
  }

  public String toString() {
    return empid + " " + empname + " " + salary;
  }

}