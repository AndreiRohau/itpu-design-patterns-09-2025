package com.arohau.facade.ex2;

public class Client {
    public void connectToServer() {
        System.out.println("Connecting to server...");
    }
    public ClientServer getClientServerInstance() {
        return new ClientServer();
    }
    public RecipientServer getRecipientServerInstance() {
        return new RecipientServer();
    }
}
