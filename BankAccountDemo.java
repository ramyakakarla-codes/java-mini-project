class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int accno,String name,double bal){
        accountNumber=accno;
        accountHolderName=name;
        balance=bal;
    }
    void deposit(double amount){
        balance= balance + amount;
        System.out.println("Amount Deposited" + amount);
    }
    void withdraw(double amount){
        if (amount<=balance){
            balance=balance - amount;
            System.out.println("Amount Withdraw" + amount);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    void display(){
        System.out.println("Account Number:"  + accountNumber);
        System.out.println("Account Holder Name:"  + accountHolderName);
        System.out.println("Balance Amount:"  + balance);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(102,"Ramya", 60000);
        ba.deposit(23000);
        ba.withdraw(30000);
        ba.display();
    }
    
}
