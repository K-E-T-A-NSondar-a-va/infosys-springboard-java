public class Driver {
    private String driverName;
    private float averageRating;

    public Driver(String driverName, float averageRating){
        this.driverName=driverName;
        this.averageRating=averageRating;
    }

    public String getDriverName(){
        return this.driverName;
    }

    public void setDriverName(String driverName){
        this.driverName=driverName;
    }

    public float getAverageRating(){
        return this.averageRating;
    }

    public void setAverageRating(float averageRating){
        this.averageRating=averageRating;
    }

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}
