import static java.lang.Math.*;
// .* will import every single static field and method from the Math class and gain direct access to all of them.
// import static java.lang.Math.max;

// PI is a static field, need to specify that we're importing a static member of the Math class.
// by importing the field, we get direct access to PI.
// PI is final.

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLargerRadius(double otherRadius) {
        return max(radius, otherRadius);
    }

    public double getSmallerRadius(double otherRadius) {
        return min(radius, otherRadius);
    }

    public double getRadiusSquared() {
        return pow(radius, 2);
    }

    public double getRadiusSquareRoot() {
        return sqrt(radius);
    }

}
