class Employee {
    int empId;
    String empName;
    double basic;

    Employee(int id, String name, double basic) {
        this.empId = id;
        this.empName = name;
        this.basic = basic;
    }

    void displaySalary() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;

        if (basic > 50000) {
            gross += basic * 0.05;   
        }

        System.out.println(empName + " Gross Salary: " + gross);
    }

}

public class Empolyees {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul", 40000);
        Employee e2 = new Employee(2, "Priya", 60000);
        Employee e3 = new Employee(3, "Amit", 55000);

        e1.displaySalary();
        e2.displaySalary();
        e3.displaySalary();
    }
}
