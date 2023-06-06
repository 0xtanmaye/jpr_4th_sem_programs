interface Shape { double area(); }

class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() { return width * height; }
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);	
        System.out.println("Area of rectangle: " + rect.area());

        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());
    }
}
