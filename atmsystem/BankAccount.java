package atmsystem;

public class BankAccount {
    private int accountBalance;

    public BankAccount(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void withdraw(int amount){
        if(amount<=accountBalance){
            accountBalance=accountBalance-amount;
            System.out.println("Withdraw Succesfully");
            System.out.println("Available balance "+accountBalance+" Rs");
        }
        else{
            System.out.println("Sorry insufficient balance.");
            System.out.println("Available balance "+accountBalance+" Rs");
        }
    }
    public void deposit(int amount){
        accountBalance+=amount;
        System.out.println("Amount added Successfully");
        System.out.println("Available balance "+accountBalance+" Rs");
    }

    public void checkBalance(){
        System.out.println("Available balance "+accountBalance+" Rs");
    }
}
