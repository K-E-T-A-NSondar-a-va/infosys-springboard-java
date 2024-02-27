package overriding;

import java.text.DecimalFormat;

public class OfficeStaff extends Faculty {

    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();

        if(designation.equals("Accountant")) {
            salary += 10000.0;
        } else if(designation.equals("Clerk")) {
            salary += 7000.0;
        } else if(designation.equals("Peon")) {
            salary += 4500.0;
        } else {
            return salary;
        }

        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
