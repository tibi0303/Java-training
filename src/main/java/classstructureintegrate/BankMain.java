package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        System.out.print("Account number: ");
        String account = scanner.nextLine();

        System.out.print("Balance: ");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(owner,account,balance);
        System.out.println(bankAccount.getInfo());

        System.out.print("Deposit: ");
        int deposit = scanner.nextInt();
        bankAccount.deposit(deposit);
        System.out.println(bankAccount.getInfo());

        System.out.print("Withdraw: ");
        int withdraw = scanner.nextInt();
        bankAccount.withdraw(withdraw);
        System.out.print(bankAccount.getInfo());
    }
}
