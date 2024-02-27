import java.text.DecimalFormat;

public class CabServiceProvider {
    private String cabServiceName;
    private int totalCabs;

    public double calculateRewardPrice(Driver driver) {
        double ratings = driver.getAverageRating();

        DecimalFormat df = new DecimalFormat("#.##");
        if(this.cabServiceName == "Halo") {
            if(ratings >= 4.5 && ratings <= 5)
                return Double.parseDouble(df.format(10 * ratings));
            else if(ratings >= 4 && ratings <= 4.5)
                return Double.parseDouble(df.format(5 * ratings));
        }
        if(this.cabServiceName == "Aber") {
            if(ratings >= 4.5 && ratings <= 5)
                return Double.parseDouble(df.format(8 * ratings));
            else if(ratings >= 4 && ratings < 4.5)
                return Double.parseDouble(df.format(3 * ratings));
        }

        return 0;
    }
    public CabServiceProvider(String cabServiceName, int totalCabs) {
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    public String getCabServiceName() {
        return cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs() {
        return totalCabs;
    }

    public void setTotalCabs(int totalCabs) {
        this.totalCabs = totalCabs;
    }
}
