package org.example.proxyRequest;

import org.example.bankSystem2.RealAccount;

public class ServerProxy implements Server{
    private RealServer realServer;
    private int requestCount;
    private static final int MAX_REQUESTS = 3;
    private long startTime;

    public ServerProxy(RealServer realServer, int requestCount, long startTime) {
        this.realServer = realServer;
        this.requestCount = requestCount;
        this.startTime = startTime;
    }

    public ServerProxy(RealServer realServer) {
        this.realServer = realServer;
    }

    @Override
    public void handleRequest() {
    long currentTime = System.currentTimeMillis();
    if (currentTime - startTime > 60000){
        startTime = currentTime;
        requestCount = 0;
    }
    if (requestCount < MAX_REQUESTS){
        requestCount++;
        realServer.handleRequest();
    }else {
        System.out.println("Request limit exceeded . try again later");
    }
    }
}
