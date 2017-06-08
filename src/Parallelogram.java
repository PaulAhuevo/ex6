public class Parallelogram extends Quadrilateral{
    protected double a;
    protected double h;
    protected double alpah;

    public Parallelogram(Vec2D pP, double a, double h, double alpha) {
        super(
                pP,
                new Vec2D(pP.getX() + a, pP.getY()),
                new Vec2D(pP.getX() + h/Math.tan(alpha) + a,pP.getY()+h),
                new Vec2D(pP.getX() + h/Math.tan(alpha),pP.getY()+h)
                );
    }

    @Override
    public double area() {
        return a*h;
    }

    @Override
    public double perimeter() {
        return 2*(a + this.getBC());
    }
}
