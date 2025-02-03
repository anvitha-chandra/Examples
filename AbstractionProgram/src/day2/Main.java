package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter details for Full-Time Employee:");
        System.out.print("Name: ");
        String fullTimeName = s.nextLine();
        System.out.print("ID: ");
        int fullTimeId = s.nextInt();
        System.out.print("Monthly Salary: ");
        double fullTimeSalary = s.nextDouble();
        s.nextLine(); 

       
        System.out.println("\nEnter details for Part-Time Employee:");
        System.out.print("Name: ");
        String partTimeName = s.nextLine();
        System.out.print("ID: ");
        int partTimeId = s.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = s.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = s.nextInt();

        
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee(fullTimeName, fullTimeId, fullTimeSalary);
        employees[1] = new PartTimeEmployee(partTimeName, partTimeId, hourlyRate, hoursWorked);

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

    }
}
