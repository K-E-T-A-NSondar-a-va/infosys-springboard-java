package integratedasssignment;

import java.util.ArrayList;
import java.util.List;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private String[] salaryComponents;
    private float experience;
    private Asset[] assets;

    public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets) {
        super(employeeName);
        this.basicPay = basicPay;
        this.salaryComponents = salaryComponents;
        this.assets = assets;
    }

    public double calculateBonus(float experience) throws InvalidExperienceException {
            if(experience >= 2.5 && experience < 4) return basicPay + 2550;
            else if(experience >= 4 && experience < 8) return basicPay + 5000;
            else if(experience >= 8 && experience < 12) return basicPay + 8750;
            else if(experience >= 12) return basicPay + 13000;
            else throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
    }

    public void calculateSalary(float experience) {
        this.experience = experience;

        String DA = "";
        String HRA = "";

        for(String s : salaryComponents) {
            if(s.startsWith("D"))
                DA = s;
            else
                HRA = s;
        }

        String temp = DA;
        DA = "";
        for(int c = temp.length() - 1; c >= 0; c--) {
            if(Character.isDigit(c)) {
                DA = c + DA;
            }
        }

        temp = HRA;
        HRA = "";
        for(int c = temp.length() - 1; c >= 0; c--) {
            if(Character.isDigit(c)) {
                HRA = c + HRA;
            }
        }

        double DAComponent = Double.parseDouble(DA);
        double HRAComponent = Double.parseDouble(HRA);
        double bonusAmount  = calculateBonus(experience);
        double salary = basicPay + (basicPay * (DAComponent / 100)) + (basicPay * (HRAComponent / 100)) + bonusAmount;
        setSalary(Math.round(salary));
    }

    public Asset[] getAssetsByDate(String lastDate) throws InvalidAssetsException {
        List<Asset> validAssets = new ArrayList<>();
        for (Asset asset : assets) {
            // Check if asset expiry is on or before the lastDate
            // Extract month from lastDate
            int lastMonth = Resources.getMonth(lastDate.split("-")[1]);
            // Extract month from asset expiry
            int expiryMonth = Resources.getMonth(asset.getAssetExpiry().split("-")[1]);
            // Extract year from lastDate
            int lastYear = Integer.parseInt(lastDate.split("-")[0]);
            // Extract year from asset expiry
            int expiryYear = Integer.parseInt(asset.getAssetExpiry().split("-")[0]);
            if ((expiryYear < lastYear) || (expiryYear == lastYear && expiryMonth <= lastMonth)) {
                validAssets.add(asset);
            }
        }
        if (validAssets.isEmpty()) {
            throw new InvalidAssetsException("No assets found for the given criteria!");
        }
        return validAssets.toArray(new Asset[0]);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public String[] getSalaryComponents() {
        return salaryComponents;
    }

    public void setSalaryComponents(String[] salaryComponents) {
        this.salaryComponents = salaryComponents;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }
}
