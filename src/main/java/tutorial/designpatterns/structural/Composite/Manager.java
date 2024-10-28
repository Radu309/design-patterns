package tutorial.designpatterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<Employee>();
    }
    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subordinates.remove(employee);
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        for (Employee e : subordinates) {
            e.showEmployeeDetails();
        }
    }
}
