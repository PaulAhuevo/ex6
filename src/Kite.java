public class Kite extends Quadrilateral {

    protected double e1;
    protected double e2;
    protected double f;

    public Kite(Vec2D pP, double e1, double e2, double f) {
        super(pP, pP, pP, pP);
    }


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
