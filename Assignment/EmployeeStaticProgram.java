class Employeee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount;

    Employeee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Name: " + empName + ", Salary: Rs " + salary);
    }

    static void printCompanyInfo() {
        System.out.println("\n" + companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeStaticProgram {
    public static void main(String[] args) {
        // Appended .0 so Java matches (String, double) exactly
        Employeee employee1 = new Employeee("Divya", 65000.0);
        Employeee employee2 = new Employeee("Arjun", 30000.0);
        Employeee employee3 = new Employeee("Meera", 50000.0);

        employee1.display();
        employee2.display();
        employee3.display();

        Employeee.printCompanyInfo();
    }
}