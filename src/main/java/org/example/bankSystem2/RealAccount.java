package org.example.bankSystem2;

public class RealAccount implements Account{
    private double balance;

    public RealAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withDrawMoney(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("withdrawn " + amount + ". New balance : "+ balance) ;
        }else {
            System.out.println("insufficient funds . Current balance " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
