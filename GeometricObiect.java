package EXAMPLE;
import java.util.Date;
public abstract class GeometricObiect {
    public String color;
    public boolean filled;
    public java.util.Date DateCreated;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated(){
        return  getDateCreated();
    }
    @Override
    public String toString() {
        return "created on " + DateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}
