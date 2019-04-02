package EXAMPLE;

public class Cirele extends GeometricObiect{

    public double radius;

    public Cirele(){}
    public Cirele(double radius ){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }


    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + ", Circle, Created: "
                + getDateCreated() + ", Radius: " + radius;
    }
}
