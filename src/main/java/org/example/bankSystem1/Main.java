package org.example.bankSystem1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new ProxyBank();

        try {
            bank.withDrawMoney("Paulo");
            bank.withDrawMoney("xXcs");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}