abstract class Shape {
    abstract void calculateArea();

    void displayInfo() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r = 5;

    void calculateArea() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 6;

    void calculateArea() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

class ShapeAbstract {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.displayInfo();
        c.calculateArea();

        r.displayInfo();
        r.calculateArea();
    }
}