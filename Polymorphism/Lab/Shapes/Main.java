package Polymorphism.Lab.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2D, 4D);
        Shape circle = new Circle(5D);

        printShape(rectangle);
        printShape(circle);
    }
    private static void printShape(Shape shape){
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());
    }
}
