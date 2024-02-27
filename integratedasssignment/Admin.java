package integratedasssignment;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    public void generateSalarySlip(Employee[] employees, float[] salaryFactor) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof ContractEmployee) {
                ((ContractEmployee) employees[i]).calculateSalary(salaryFactor[i]);
            } else if (employees[i] instanceof PermanentEmployee) {
                ((PermanentEmployee) employees[i]).calculateSalary(salaryFactor[i]);
            }
            System.out.println("Salary Slip for " + employees[i].getEmployeeName() + ": " + employees[i].getSalary());
        }
    }

    public int generateAssetsReport(Employee[] employees, String lastDate) {
        int totalAssets = 0;
        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                try {
                    Asset[] assets = ((PermanentEmployee) employee).getAssetsByDate(lastDate);
                    totalAssets += assets.length - 1;
                } catch (InvalidAssetsException e) {
                    System.out.println(e.getMessage());
                    return -1;
                }
            }
        }
        return totalAssets;
    }

    public String[] generateAssetsReport(Employee[] employees, char assetCategory) {
        List<String> assetIds = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                Asset[] assets = ((PermanentEmployee) employee).getAssets();
                for (Asset asset : assets) {
                    if (asset.getAssetId().toUpperCase().startsWith(String.valueOf(assetCategory).toUpperCase())) {
                        assetIds.add(asset.getAssetId());
                    }
                }
            }
        }
        return assetIds.toArray(new String[0]);
    }
}
