class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

class EmployeeCount {
    public static void main(String[] args) {

        Employee e1 = new Employee("Om", 1);
        Employee e2 = new Employee("Rahul", 2);
        Employee e3 = new Employee("Amit", 3);

        Employee.showCount();
    }
}