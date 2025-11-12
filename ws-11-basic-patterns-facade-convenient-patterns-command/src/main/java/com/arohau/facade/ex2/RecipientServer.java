package com.arohau.facade.ex2;

public class RecipientServer {
    public void authenticateRecipient() {
        System.out.println("Authenticating recipient...");
    }
    public void sendMessage(String text) {
        System.out.println("Sending message... text = " + text);
    }
    public Recipient createRecipient() {
        return new Recipient();
    }
}
