package Exercice.DefiningClass.P02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Departments {

    private String name;
    private List<Employee> employeeList;

    public Departments(String name) {
        this.name = name;
        employeeList = new ArrayList<>();
    }

    public double calculateAverageSalary() {
        return this.employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
