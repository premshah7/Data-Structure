// packCPI DS.DS.LAB-6;

import java.util.Scanner;

class Student{
    String name;
    double CPI;
    String Semester;
    int Enrollment_No;
    String designation;
    public void getStuDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Student Name: ");
        this.name = sc.next();
        
        System.out.print("Student CPI: ");
        this.CPI = sc.nextDouble();
        
        System.out.print("Student Semester: ");
        this.Semester = sc.next();
        
        System.out.print("Student ID: ");
        this.Enrollment_No = sc.nextInt();

        System.out.println();
   
    }

    public void printDetails(){
        System.out.print("Student name is : "+this.name);
        System.out.print("\nStudent CPI is : "+this.CPI);
        System.out.print("\nStudent Semester is : "+this.Semester);
        System.out.print("\nStudent ID is : "+this.Enrollment_No);;
        
    }
}

public class StudDetails {
    public static void main(String[] args) {
        // Student s = new Student();
        System.out.print("Enter number of student : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for(int i=0;i<n;i++){
            s[i] = new Student();
            s[i].getStuDetails();
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of student "+i+" is :" );
            s[i].printDetails();
        }
        
    }   
}
