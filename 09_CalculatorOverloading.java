// 9. In a Calculator class, create multiple methods named add() with different
// parameter lists (e.g., one taking two integers, another taking three integers, and a
// third taking two doubles).
// Call the add() method with various arguments in your main program, demonstrating
// that the correct method is selected at compile time based on the arguments provided.

class CalculatorOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculatorOverloading c = new CalculatorOverloading();

        System.out.println(c.add(5, 10));
        System.out.println(c.add(5, 10, 15));
        System.out.println(c.add(5.5, 2.5));
    }
}