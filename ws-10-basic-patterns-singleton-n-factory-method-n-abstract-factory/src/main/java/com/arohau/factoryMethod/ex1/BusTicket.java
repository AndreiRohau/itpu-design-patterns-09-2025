package com.arohau.factoryMethod.ex1;

public class BusTicket implements Ticket {
    @Override
    public String getTicketType() {
        return "A Valid Bus Ticket";
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
