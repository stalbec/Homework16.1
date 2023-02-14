public class Circle extends Shapes{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void findArea() {
        super.findArea();
    System.out.println("Area of circle:  " +(Math.PI * (radius*radius)));

    }
}

