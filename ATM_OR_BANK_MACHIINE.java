// package JAVA_PROJECTS;

import java.util.Scanner;

//atm machine project only using oops
class ATM{
    float balance;
    int pin = 5674;
    
    
    public void check_pin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin==pin){
            menu();
        }
        else{
            System.out.println("enter a valid pin ");
            check_pin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice ");
        System.out.println("1.Check balance");
        System.out.println("2.withdraw money");
        System.out.println("3.Diposit money");
        System.out.println("4.exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt(); 

        if (opt==1){
            check_balance();
            menu();
        }
        else if(opt==2){
            withdraw_money();
            menu();
        }
        else if (opt==3){
            diposit_money();
            menu();
        }
        else if(opt ==4){
            System.out.println("enterd choice not fount in menu");
            System.out.println("your choice");
            menu();

        }
        else{
            System.out.println("enter a valid choice");
        }
    }

    private void diposit_money() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'diposit_money'");
       System.out.println("enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount ;

    }

    public void check_balance(){
        System.out.println("balance"+balance);
        menu();
    }

    public void withdraw_money(){
       System.out.println("Enter amount to withdrw");
       Scanner sc = new Scanner(System.in);
       float amount = sc.nextFloat();
       if (amount>balance){
        System.out.println("insufficient balance");
       }
       else{
        balance = balance-amount;
        System.out.println("money withdrawn sucessfully");

       }
       menu();

    

    }
}
public class ATM_OR_BANK_MACHIINE {
    public static void main(String[] args) {

        ATM s1 = new ATM();
        s1.check_pin();



    
    
    }
    
}
