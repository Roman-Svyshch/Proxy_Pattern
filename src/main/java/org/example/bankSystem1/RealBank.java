package org.example.bankSystem1;

public class RealBank implements Bank{
    @Override
    public void withDrawMoney(String clientName) throws Exception {
        System.out.println("Withdraw from the atm...");
    }
}
