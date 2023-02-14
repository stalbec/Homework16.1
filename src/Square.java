public class Square extends Shapes {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void findArea() {
        super.findArea();
    System.out.println("Area of square:  " + length * length);
    }
}
