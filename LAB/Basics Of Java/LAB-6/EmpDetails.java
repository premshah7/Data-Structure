// package DS.DS.LAB-6;

import java.util.Scanner;

class Employee{
    String name;
    int age;
    double salary;
    int employee_ID;
    String designation;
    public void getEmpDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Employee Name: ");
        this.name = sc.next();
        
        System.out.print("Employee Age: ");
        this.age = sc.nextInt();
        
        System.out.print("Employee Salary: ");
        this.salary = sc.nextDouble();
        
        System.out.print("Employee ID: ");
        this.employee_ID = sc.nextInt();

        System.out.print("Employee Designation: ");
        this.designation = sc.next();
        System.out.println();
   
    }

    public void printDetails(){
        System.out.print("Emp name is : "+name);
        System.out.print("\nEmp age is : "+age);
        System.out.print("\nEmp salary is : "+salary);
        System.out.print("\nEmp ID is : "+employee_ID);
        System.out.print("\nEmp designation is : "+designation);
        
    }
}

public class EmpDetails {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getEmpDetails();
        emp.printDetails();
    }   
}
