package intefaces;

public class OfficeStaff extends Faculty {
    private String designation;

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        if(designation.equals("Accountant")) return salary + 10000.0;
        else if(designation.equals("Clerk")) return salary + 7000.0;
        else if(designation.equals("Peon")) return salary + 4500.0;
        else return salary;
    }

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
