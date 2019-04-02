package EXAMPLE;

public class Rectangle extends GeometricObiect {
    public double width;
    public double height;

    public Rectangle(){}

    public  void Rectangle( double width, double height){


    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangle, Created: "
                + getDateCreated() + ", Width: " + width +
                ", Height: " + height;
    }
}
