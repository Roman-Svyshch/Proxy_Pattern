package org.example.proxyRequest;

public class RealServer implements Server{
    @Override
    public void handleRequest() {
        System.out.println("request successful");
    }
}
