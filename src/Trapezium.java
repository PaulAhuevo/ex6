public class Trapezium extends Quadrilateral {

    protected double a;
    protected double c;
    protected double h;

    public Trapezium(Vec2D pP, double a, double c, double h) {
        super(pP, pP, pP, pP);
    }

    @Override
    public double area() {
        return ((a+c)/2)*h;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
