package overriding;

import java.text.DecimalFormat;

public class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        DecimalFormat df = new DecimalFormat("#.##");

        if(qualification.equals("Doctoral")) {
            salary += 20000;
        } else if(qualification.equals("Masters")) {
            salary += 18000;
        } else if(qualification.equals("Bachelors")) {
            salary += 15555;
        } else if(qualification.equals("Associate")) {
            salary += 10000;
        } else {
            return Double.parseDouble(df.format(salary));
        }

        return Double.parseDouble(df.format(salary));
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
