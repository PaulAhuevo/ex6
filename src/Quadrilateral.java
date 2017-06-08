abstract public class Quadrilateral {

    protected Vec2D pA;
    protected Vec2D pB;
    protected Vec2D pC;
    protected Vec2D pD;

    public Quadrilateral(Vec2D pA, Vec2D pB, Vec2D pC, Vec2D pD) {
    }

    abstract public double area();
    abstract public double perimeter();

    public static double area(Quadrilateral[] vs) {
        return 0;
    }

    public static Trapezium[] parFilter(Quadrilateral[] vs) {
        return new Trapezium[] {new Trapezium(new Vec2D(1,1), 2,2, 2)};
    }

    public Vec2D getA() {return pA;}
    public Vec2D getB() {return pB;}
    public Vec2D getC() {return pC;}
    public Vec2D getD() {return pD;}

    public double getAB() {return Math.sqrt(((pA.getX()-pB.getX())*(pA.getX()-pB.getX())) + ((pA.getY()-pB.getY())*(pA.getY()-pB.getY())));}
    public double getBC() {return Math.sqrt(((pB.getX()-pC.getX())*(pB.getX()-pC.getX())) + ((pB.getY()-pC.getY())*(pB.getY()-pC.getY())));}
    public double getCD() {return Math.sqrt(((pC.getX()-pD.getX())*(pC.getX()-pD.getX())) + ((pC.getY()-pD.getY())*(pC.getY()-pD.getY())));}
    public double getDA() {return Math.sqrt(((pD.getX()-pA.getX())*(pD.getX()-pA.getX())) + ((pD.getY()-pA.getY())*(pD.getY()-pA.getY())));}

}
