package integratedasssignment;

public abstract class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;
    private static int contractIdCounter;
    private static int permenantIdCounter;

    static {
        contractIdCounter = 10000;
        permenantIdCounter = 10000;
    }

    public Employee(String employeeName) {
        setEmployeeName(employeeName);
        if(this instanceof ContractEmployee) {
            this.employeeId = "C"+ ++contractIdCounter;
        } else {
            this.employeeId = "E"+ ++permenantIdCounter;
        }
//        employeeId = "E"+ ++permenantIdCounter;
    }

    public abstract void calculateSalary(float salaryFactor);

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
//        String regex = "^[A-Z][a-zA-Z]+(?: [A-Z][a-zA-Z]+)+$";
        String regex = "^[A-Z][a-zA-Z]+(?:\\s[A-Z][a-zA-Z]+)+$";

        if(employeeName.matches(regex)) {
            this.employeeName = employeeName;
        } else {
            this.employeeName = null;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public static int getContractIdCounter() {
        return contractIdCounter;
    }

    public static void setContractIdCounter(int contractIdCounter) {
        Employee.contractIdCounter = contractIdCounter;
    }

    public static int getPermenantIdCounter() {
        return permenantIdCounter;
    }

    public static void setPermenantIdCounter(int permenantIdCounter) {
        Employee.permenantIdCounter = permenantIdCounter;
    }
}
