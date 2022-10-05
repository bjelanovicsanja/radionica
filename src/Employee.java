public class Employee {
    private String EmployeeName;
    private static int EmployeeSalary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        EmployeeName = name;
        EmployeeSalary = salary;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    //methods

    public static void raiseSalary(int percentage) {
        int raise = EmployeeSalary * percentage / 100;
        EmployeeSalary = EmployeeSalary + raise;
    }
}



