import java.util.*;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }

    public List<Employee> searchByName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchByDepartment(String department) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                result.add(employee);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Employee employee1 = new Employee("John Smith", "Sales");
        Employee employee2 = new Employee("Mary Johnson", "Marketing");

        system.addEmployee(employee1);
        system.addEmployee(employee2);

        List<Employee> salesEmployees = system.searchByDepartment("Sales");
        System.out.println("Sales employees:");
        for (Employee employee : salesEmployees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
