package org.example.bankSystem1;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank{
    private RealBank  realBank = new RealBank();
    private static List<String> bannedClients;
    static {
        bannedClients = new ArrayList<>();
        bannedClients.add("xXcs");
        bannedClients.add("me@me");
        bannedClients.add("@xil.com");
    }
    @Override
    public void withDrawMoney(String clientName) throws Exception {
        if (bannedClients.contains(clientName)){
            throw  new Exception("Access denied ! ");
        }realBank.withDrawMoney(clientName);
    }
}
