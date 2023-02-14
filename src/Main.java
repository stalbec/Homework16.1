public class Main {
    public static void main(String[] args) {
        Shapes rectangle = new Rectangle(3,2);
        rectangle.findArea();

        Shapes circle = new Circle(2);
        circle.findArea();

        Shapes square = new Square(6);
        square.findArea();

        Shapes triangle = new Triangle(4,5,6);
        triangle.findArea();
    }
}