import java.util.Scanner;

public class Student {
    String name;
    String age;
    String subject;
    static String branch="CSE(AI)";
    static String institute="AITS";
    Student(){
        name=null;
        age=null;
        subject=null;
    }
    void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your age: ");
        age=sc.nextLine();
        System.out.print("Enter your subject: ");
        subject=sc.nextLine();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Subject: "+subject);
        System.out.println("class:"+branch);
        System.out.println("institute:"+institute);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.takeInput();
        s1.display();
        s2.takeInput();
        s2.display();
    }
}
