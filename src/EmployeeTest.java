public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Sanja", 450);
        staff[1] = new Employee("Miljan", 450);
        staff[2] = new Employee("Nikolina", 450);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            System.out.println("Name employee is " + e.getEmployeeName() + " and employee salary is " + e.getEmployeeSalary());
        }
    }
}