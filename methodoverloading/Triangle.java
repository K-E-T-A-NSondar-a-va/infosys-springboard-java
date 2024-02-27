package methodoverloading;

import java.text.DecimalFormat;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        point1 = new Point(0, 0);
        point2 = new Point(1,1);
        point3 = new Point(2, 5);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculatePerimeter() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);

        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(a + b + c));
    }

    public double calculateArea() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);

        double s = (a + b + c)/ 2;
        DecimalFormat df = new DecimalFormat("#.##");
        double area = Double.parseDouble(df.format(Math.sqrt(s*((s-a)*(s-b)*(s-c)))));

        return area;
    }

    public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate) {
        point1 = new Point(point1XCoordinate, point1YCoordinate);
        point2 = new Point(point2XCoordinate, point2YCoordinate);
        point3 = new Point(point3XCoordinate, point3YCoordinate);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
}
