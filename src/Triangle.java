public class Triangle extends Shapes{
private double leftLine;
private double rightLine;
private double downLine;

    public Triangle(double leftLine, double rightLine, double downLine) {
        this.leftLine = leftLine;
        this.rightLine = rightLine;
        this.downLine = downLine;
    }

    public double getLeftLine() {
        return leftLine;
    }

    public void setLeftLine(double leftLine) {
        this.leftLine = leftLine;
    }

    public double getRightLine() {
        return rightLine;
    }

    public void setRightLine(double rightLine) {
        this.rightLine = rightLine;
    }

    public double getDownLine() {
        return downLine;
    }

    public void setDownLine(double downLine) {
        this.downLine = downLine;
    }

    @Override
    public void findArea() {
        super.findArea();
        System.out.println("Area of triangle:  " + 0.5*leftLine*rightLine*downLine);
    }
}
