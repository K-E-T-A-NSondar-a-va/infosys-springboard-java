package integratedasssignment;

public class ContractEmployee extends Employee {
    private double wagePerHour;

    public ContractEmployee(String employeeName, double wagePerHour) {
        super(employeeName);
        this.wagePerHour = wagePerHour;
    }

    public void calculateSalary(float hoursWorked) {
        if (hoursWorked >= 190) {
            setSalary(Math.round(wagePerHour * hoursWorked));
        } else {
            double deduction = 0.5 * wagePerHour * (190 - hoursWorked);
            setSalary(Math.round(wagePerHour * hoursWorked - deduction));
        }
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }
}
