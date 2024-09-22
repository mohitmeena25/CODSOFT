package atmsystem;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(10000);
        System.out.println("Welcome to ATM system : ");
        Scanner kb=new Scanner(System.in);
        int amount,choice;
        do {
            System.out.println("Please select an operation - \n1.Withdraw Amount\n2.Deposit Amount\n3.Check Balance\n4.Exit");
            choice=kb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw : ");
                    amount = kb.nextInt();
                    ba.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit : ");
                    amount = kb.nextInt();
                    ba.deposit(amount);
                    break;
                case 3:
                    ba.checkBalance();
                    break;
                case 4:
                    System.out.println("Thankyou for using Atm system GoodBye..");
                    break;
                default:
                    System.out.println("Wrong Choice Please try again");
                    break;
            }
        }while(choice!=4);
    }
}
