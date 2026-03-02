class EmployeeSalary{

    int empId;
    int basicSalary;
    void calculateSalary() {

        int bonus = 1000;

        int totalSalary = basicSalary + bonus;

        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {

        EmployeeSalary e1 = new EmployeeSalary();
        e1.empId = 1;
        e1.basicSalary = 20000;

       
        e1.calculateSalary();
    }
}