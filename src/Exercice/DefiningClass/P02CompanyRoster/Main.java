package Exercice.DefiningClass.P02CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfEmployee = Integer.parseInt(scanner.nextLine());

        List<Employee> list = new ArrayList<>();
        List<Departments> departmentsList = new ArrayList<>();
        for (int i = 0; i < countOfEmployee; i++) {
            String[] employeeData = scanner.nextLine().split("\\s+");

            String employeeName = employeeData[0];
            double employeeSalary = Double.parseDouble(employeeData[1]);
            String employeePosition = employeeData[2];
            String employeeDepartment = employeeData[3];

            Employee employee = null;

            switch (employeeData.length) {

                case 4:
                    //no email no age
                    employee = new Employee(employeeName, employeeSalary, employeePosition, employeeDepartment);
                    break;
                case 5:
                    if (employeeData[4].contains("@")) {
                        String employeeEmail = employeeData[4];
                        employee = new Employee(employeeName, employeeSalary, employeePosition, employeeDepartment, employeeEmail);
                    } else {
                        int employeeAge = Integer.parseInt(employeeData[4]);
                        employee = new Employee(employeeName, employeeSalary, employeePosition, employeeDepartment, employeeAge);
                    }
                    break;
                case 6:
                    // with email and age
                    String employeeEmail = employeeData[4];
                    int employeeAge = Integer.parseInt(employeeData[5]);

                    employee = new Employee(employeeName, employeeSalary, employeePosition, employeeDepartment, employeeEmail, employeeAge);
                    break;
            }

            boolean departmentsExist = departmentsList.stream().anyMatch(department -> department.getName().equals(employeeDepartment));

            if (!departmentsExist) {
                Departments department = new Departments(employeeDepartment);
                departmentsList.add(department);
            }

            Departments currentDepartment = departmentsList.stream()
                    .filter(department -> department.getName().equals(employeeDepartment))
                    .findFirst()
                    .get();

            currentDepartment.getEmployeeList().add(employee);

        }


        System.out.println();
    }
}
