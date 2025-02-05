package AnuragEx;

class Employee {
    private int empId;
    private String empName;
    private double sal; 
    private int yearsOfExperience;

    public Employee(int empId, String empName, double sal, int yearsOfExperience) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setEmployeeDetails(int empId, String empName, double sal, int yearsOfExperience) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Monthly Salary: " + sal);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }

    public void getLoanEligibility() {
        if (yearsOfExperience > 5) {
            double annualSalary = sal * 12;
            double loanAmount = 0;

            if (annualSalary >= 15_00_000) {
                loanAmount = 7_00_000;
            } else if (annualSalary >= 10_00_000) {
                loanAmount = 5_00_000;
            } else if (annualSalary >= 6_00_000) {
                loanAmount = 2_00_000;
            }

            if (loanAmount > 0) {
                System.out.println(empName + " is eligible for a loan of ₹" + loanAmount);
            } else {
                System.out.println(empName + " is not eligible for a loan.");
            }
        } else {
            System.out.println(empName + " is not eligible for a loan due to insufficient experience.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 60000, 6);
        emp1.getEmployeeDetails();
        emp1.getLoanEligibility();

        System.out.println();

        Employee emp2 = new Employee(102, "Alice Smith", 45000, 4);
        emp2.getEmployeeDetails();
        emp2.getLoanEligibility();
    }
}

