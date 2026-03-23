// 13. A company wants to evaluate employee performance.
// Create an abstract class Employee with:
//  attributes: name, id
//  abstract method calculateBonus()
// Create subclasses:
//  Manager → bonus is 20% of salary
//  Developer → bonus is 10% of salary plus project incentive
// Demonstrate runtime polymorphism by storing different employee objects in an
// Employee reference and calling calculateBonus().

abstract class Employee {
    String name;
    int id;

    abstract double calculateBonus(double salary);
}

class Manager extends Employee {
    double calculateBonus(double salary) {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double calculateBonus(double salary) {
        return salary * 0.10 + 5000;
    }
}
class EmployeeBonus {
    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        System.out.println("Manager Bonus: " + e.calculateBonus(50000));

        e = new Developer();
        System.out.println("Developer Bonus: " + e.calculateBonus(50000));
    }
}