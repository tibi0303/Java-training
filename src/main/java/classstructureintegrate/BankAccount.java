package classstructureintegrate;

public class BankAccount {
    private String owner;
    private String accountNumber;
    private int balance;

    public BankAccount(String owner, String accountNumber,int balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money){
        balance = balance + money;
    }

    public void withdraw(int money){
        balance = balance - money;
    }

    public String getInfo(){
        return getOwner() + " (" + getAccountNumber() + "): " + getBalance() + " Ft";
    }
}
