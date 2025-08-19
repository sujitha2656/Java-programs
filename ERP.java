import java.util.Scanner;

class Employee {
    String name;
    int age;
    char gender;
    int id;

    void getDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter Age: ");
        age = input.nextInt();
        System.out.print("Enter Gender (M/F): ");
        gender = input.next().charAt(0);
        System.out.print("Enter ID: ");
        id = input.nextInt();
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("ID: " + id);
    }
}

class HRDepartment extends Employee {
    void getEmployeeDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("We are HR Department and we manage everything.");
    }
}


class Finance extends Employee {
    void getEmployeeDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("We are Finance Department and we manage money.");
    }
}


class Technical extends Employee {
    void getEmployeeDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("We are Technical Department and we manage the technical part.");
    }
}


class Operations extends Employee {
    void getEmployeeDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("We are Operations Department and we manage operations.");
    }
}


public class ERP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== ERP Department Menu ===");
        System.out.println("1. HR Department");
        System.out.println("2. Finance Department");
        System.out.println("3. Technical Department");
        System.out.println("4. Operations Department");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                HRDepartment hr = new HRDepartment();
                hr.getDetails();
                hr.displayDetails();
                hr.getEmployeeDetails();
                break;
            case 2:
                Finance fn = new Finance();
                fn.getDetails();
                fn.displayDetails();
                fn.getEmployeeDetails();
                break;
            case 3:
                Technical tc = new Technical();
                tc.getDetails();
                tc.displayDetails();
                tc.getEmployeeDetails();
                break;
            case 4:
                Operations op = new Operations();
                op.getDetails();
                op.displayDetails();
                op.getEmployeeDetails();
                break;
            case 5:
                System.out.println("------- Service Exiting -------");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}


