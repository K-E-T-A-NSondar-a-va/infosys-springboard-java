package inheritance;

import java.text.DecimalFormat;

public class PermanentEmployee extends Employee {

    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public void calculateMonthlySalary() {
        double rate = 0;

        if(experience < 3)
            rate = 0;
        else if(experience >= 3 && experience < 5)
            rate = 0.05;
        else if(experience >= 5 && experience < 10)
            rate = 0.07;
        else if(experience >= 10)
            rate = 0.12;

        double variable_component = basicPay * rate;

        DecimalFormat df = new DecimalFormat("#.##");
        double salary = Double.parseDouble(df.format(basicPay + hra + variable_component));

        setSalary(salary);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
