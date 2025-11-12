package com.arohau.facade.ex2;

public class SendMessageFacade {
    public void sendMessage(String text) {
        Client client = new Client();
        client.connectToServer();

        ClientServer clientServer = client.getClientServerInstance();
        clientServer.authenticateClient();
        clientServer.routeToRecipient();

        RecipientServer recipientServer = client.getRecipientServerInstance();
        recipientServer.authenticateRecipient();
        recipientServer.sendMessage(text);

        Recipient recipient = new Recipient();
        recipient.receiveMessage();
    }
}
