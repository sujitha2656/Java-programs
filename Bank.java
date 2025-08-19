import java.util.Scanner;
class Bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("enter your  number:");
        String n=sc.next();
        System.out.println("enter your gender:");
        Character gender=sc.next().charAt(0);
        System.out.println("enter your account balance:");
        double balance=sc.nextDouble();
        System.out.println(" enter 1 for loan,2 for withdrawal,3 for deposit,4 to exit:");
        int loan=sc.nextInt();
        double amount=0;
        double years=0;
        double interest=0;
        double withdrawal=0;
        double deposit=0;
        switch(loan) {
            case 1:
                double roi = 9.1;
                System.out.println("Enter your loan amount:");
                amount = sc.nextDouble();
                System.out.println("Enter in how many years u will pay:");
                years = sc.nextInt();
                interest = (amount * years * roi) / 100;
                System.out.println("The Total interest you have to pay in " + years+" years is"+" " + interest);
                System.out.println("The Total amount you pay is:"+(interest+ amount));
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw from your account:");
                withdrawal=sc.nextDouble();
                if(withdrawal<balance) {
                    System.out.println("Now your bank balance is:"+(balance-withdrawal));
                }
                else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 3:
                System.out.println("Enter your amount to deposit into your account:");
                deposit=sc.nextDouble();
                if (deposit>0) {
                    System.out.println("YOUR DEPOSIT IS SUCCESSFUL:");
                    System.out.println("The balance after your deposit is:" + (deposit + balance));
                }
                else{
                    System.out.println("YOUR DEPOSIT IS FAILED");
                    System.out.println("please try again");
                }
                break;
            case 4:
                System.out.println("Thank you for using our services.....*:");
                System.exit(0);
            default:
                System.out.println("Please enter a valid service");
        }
        System.out.println("......CUSTOMER DETAILS.....");
        System.out.println("Your name is:"+name);
        System.out.println("Your age is:"+age);
        System.out.println("Your Mobile num is:"+n);
        System.out.println("Your gender is:"+gender);
        System.out.println("Your account balance is:"+balance);
        System.out.println("Your choosen service is:"+loan);
        if (loan==1){
            System.out.println("The loan amount is:"+amount);
            System.out.println("Your interest is:"+interest);
            System.out.println("Your selected years are:"+years);
            System.out.println("total loan amount you have to pay at end is:"+(interest+amount));

        }
        else if(loan==2){
            System.out.println("The amount you want to withdrawl is:"+withdrawal);
            System.out.println("Your total acc balance after withdrawal is:"+(balance-withdrawal));
        }
        else if (loan==3){
            System.out.println("The amount you want to deposit is:"+deposit);
            System.out.println("the total acc balance after deposit is:"+(deposit+balance));
        }
        else if (loan==4){

            System.out.println("Thank you for using our services.....*:");
        }
        else{
            System.out.println("Please enter a valid service");
        }

    }
}
