// 20. A company wants to clearly assign constructor parameters to object variables.

// Question:
// Create a class Employee with variables name and salary.
// Use this keyword inside the constructor to initialize object variables.
// Display employee details.
class EmployeeThis {

    String name;
    double salary;

    EmployeeThis(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        EmployeeThis e = new EmployeeThis("Om", 50000);
        e.display();
    }
}