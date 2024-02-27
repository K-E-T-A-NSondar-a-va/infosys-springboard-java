package intefaces;

public class Teacher extends Faculty {
    private String qualification;

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        if(qualification.equals("Doctoral")) return salary + 20000.0;
        else if(qualification.equals("Masters")) return salary + 18000.0;
        else if(qualification.equals("Bachelors")) return salary + 15500.0;
        else if(qualification.equals("Associate")) return salary + 10000.0;
        else return salary;
    }

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
