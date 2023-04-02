package exercise;

// BEGIN
public class Circle {
    private Point centr;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(Point centr, int radius) {
        this.centr = centr;
        this.radius = radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("");
        } else {
            return Math.PI * radius * radius;
        }
    }
}
// END
