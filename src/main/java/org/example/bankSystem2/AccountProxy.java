package org.example.bankSystem2;

public class AccountProxy implements Account{
    private RealAccount realAccount;

    public AccountProxy(RealAccount realAccount) {
        this.realAccount = realAccount;
    }

    @Override
    public void withDrawMoney(double amount) {
        if (amount > 5000) {
            System.out.println("Cannot withdraw more than 5000 in a single transaction.");
        } else if (realAccount.getBalance() < amount) {
            System.out.println("Insufficient funds. Current balance: " + realAccount.getBalance());
        } else {
            realAccount.withDrawMoney(amount);
        }
    }
}
