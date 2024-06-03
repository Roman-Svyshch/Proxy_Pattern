package org.example.bankSystem2;

public class Client {
    private Account account;

    public Client(Account account) {
        this.account = account;
    }

    public void performWithdraw(double amount) {
        account.withDrawMoney(amount);
    }

    public static void main(String[] args) {
        RealAccount realAccount = new RealAccount(1000);
        AccountProxy accountProxy = new AccountProxy(realAccount);
        Client client = new Client(accountProxy);

        client.performWithdraw(100);   // Withdrawn 100. New balance: 900
        client.performWithdraw(600);   // Cannot withdraw more than 500 in a single transaction.
        client.performWithdraw(500);   // Withdrawn 500. New balance: 400
        client.performWithdraw(450);   // Insufficient funds. Current balance: 400
    }
}
