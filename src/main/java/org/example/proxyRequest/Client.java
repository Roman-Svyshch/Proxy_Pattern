package org.example.proxyRequest;

public class Client {
    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void sendRequest() {
        server.handleRequest();
    }

    public static void main(String[] args) {
        RealServer realServer = new RealServer();
        ServerProxy serverProxy = new ServerProxy(realServer);
        Client client = new Client(serverProxy);

        // Simulate sending requests
        client.sendRequest(); // Request is being processed by the real server.
        client.sendRequest(); // Request is being processed by the real server.
        client.sendRequest(); // Request is being processed by the real server.
        client.sendRequest(); // Request limit exceeded. Try again later.
    }
}
