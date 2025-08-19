package oops;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    char gender;
    int empid;
    Employee(String name,int age,char gender,int empid)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.empid=empid;

    }
    void displayEmployeeDetails()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);
        System.out.println("empid:"+empid);
    }
}
class HRdepartment extends Employee
{
    String department;
    double salary;
    HRdepartment(String name,int age,char gender,int empid,String department,double salary)
    {
        super(name,age,gender,empid);
        this.department=department;
        this.salary=salary;
    }
    void displayHRdeparmentDetails()
    {
        displayEmployeeDetails();
        System.out.println("department:"+department);
        System.out.println("salary:"+salary);
    }
}
class Financedepartment extends Employee
{
    String department;
    double salary;
    Financedepartment(String name,int age,char gender,int empid,String department,double salary)
    {
        super(name,age,gender,empid);
        this.department=department;
        this.salary=salary;
    }
    void displayFinancedeparmentDetails()
    {
        displayEmployeeDetails();
        System.out.println("department:"+department);
        System.out.println("salary:"+salary);
    }
}
class Technicaldepartment extends Employee
{
    String department;
    double salary;
    Technicaldepartment(String name,int age,char gender,int empid,String department,double salary)
    {
        super(name,age,gender,empid);
        this.department=department;
        this.salary=salary;
    }
    void displayTechnicaldepartmentDetails()
    {
        displayEmployeeDetails();
        System.out.println("department:"+department);
        System.out.println("salary:"+salary);
    }
}
class Operatingdepartment extends Employee
{
    String department;
    double salary;
    Operatingdepartment(String name,int age,char gender,int empid,String department,double salary)
    {
        super(name,age,gender,empid);
        this.department=department;
        this.salary=salary;
    }
    void displayOperatingdeparmentDetails()
    {
        displayEmployeeDetails();
        System.out.println("department:"+department);
        System.out.println("salary:"+salary);
    }
}
class Employeedata {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for HR department:");
        System.out.println("enter 2 for Finance department:");
        System.out.println("enter 3 for Technical department:");
        System.out.println("enter 4 for Operating department:");
        int c=sc.nextInt();
        sc.nextLine();
        System.out.println("department details");
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter gender:");
        char gender=sc.next().charAt(0);
        System.out.println("enter empid:");
        int empid=sc.nextInt();
        System.out.println("enter salary:");
        double salary=sc.nextDouble();
        switch(c) {
            case 1:
            {
                HRdepartment hr = new HRdepartment(name,age,gender,empid,"HR",salary);
                hr.displayHRdeparmentDetails();
                break;
            }
            case 2:
            {
                Financedepartment fd = new Financedepartment(name,age,gender,empid,"Finance",salary);
                fd.displayFinancedeparmentDetails();
                break;
            }
            case 3:
            {
                Technicaldepartment td = new Technicaldepartment(name,age,gender,empid,"Technical",salary);
                td.displayTechnicaldepartmentDetails();
                break;
            }
            case 4:
            {
                Operatingdepartment od = new Operatingdepartment(name,age,gender,empid,"operating",salary);
                od.displayOperatingdeparmentDetails();
                break;
            }
            default:
                System.out.println("enter valid choice");

        }
    }
}
