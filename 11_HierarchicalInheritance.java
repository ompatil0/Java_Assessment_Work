// 11. A drawing application is being developed where different shapes can be created.
// All shapes share some common properties, so a base class Shape is created with a
// method display() to show general shape information.
// Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
// has its own method to calculate and display its area.
// This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
// single base class.

class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = " + (3.14 * 5 * 5));
    }
}

class HierarchicalInheritance extends Shape {
    void area() {
        System.out.println("Rectangle area = " + (4 * 6));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        HierarchicalInheritance r = new HierarchicalInheritance();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}