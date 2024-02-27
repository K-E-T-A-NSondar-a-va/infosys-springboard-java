package methodoverloading;

import java.text.DecimalFormat;

class Point {
    private double xCoordinate;
    private double yCoordinate;

    // Constructor
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Getter methods
    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    // Setter methods
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    // Method to calculate distance from origin (0,0)
    public double calculateDistance() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate)));
    }

    // Method to calculate distance between two points
    public double calculateDistance(Point point) {
        DecimalFormat df = new DecimalFormat("#.##");
        double xDifference = point.getxCoordinate() - this.xCoordinate;
        double yDifference = point.getyCoordinate() - this.yCoordinate;
        return Double.parseDouble(df.format(Math.sqrt(xDifference * xDifference + yDifference * yDifference)));
    }
}

