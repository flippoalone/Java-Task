class BankApplication {
    int balance = 1000;

    void withdraw() {

        int withdrawAmount = 200;

        balance = balance - withdrawAmount;

        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        BankApplication account1 = new BankApplication();
        account1.withdraw();
    }
}