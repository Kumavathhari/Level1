package Level1;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private long accuntNumber;

    BankAccount(double initialAmount,long accuntNumber){
        this.balance=initialAmount;
        this.accuntNumber=accuntNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount+" deposited sucessfully ....");
        }else {
            System.out.println("Invalid input ... try with Positive numbers");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println(amount+" withdraw sucessfully ....");
        }else {
            System.out.println("Insufficient balance ... ");
        }
    }

    public double getBalance(){
        return balance;
    }

    public long getAccuntNumber(){
        return  accuntNumber;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Intial Amount  : ");
        long initialAmount = sc.nextLong();

        System.out.print("Account Number : ");
        long accountNumber = sc.nextLong();

        BankAccount b = new BankAccount(initialAmount,accountNumber);

        System.out.println("Intial Balance : "+b.getBalance());

        System.out.print("Enter a money to deposit : ");
        long depositMoney = sc.nextLong();
        b.deposit(depositMoney);

        System.out.println("After deposit Total amount : "+b.getBalance());


        System.out.print("Enter a money to withdraw : ");
        long withdrawMoney = sc.nextLong();
        b.withdraw(withdrawMoney);

        System.out.println("After withdraw Total amount : "+b.getBalance());

    }
}
