class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance for " + accountHolderName);
        } else {
            balance -= amount;
            System.out.println(accountHolderName + " Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println(accountHolderName + " Balance: " + balance);
      
    }

}


public class BankAccounts {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Rahul", 5000);
        BankAccount a2 = new BankAccount(102, "Priya", 8000);

        a1.deposit(2000);
        a1.withdraw(1000);
        a1.withdraw(7000);   
        a1.displayBalance();

        a2.deposit(1000);
        a2.withdraw(3000);
        a2.displayBalance();
    }
}
