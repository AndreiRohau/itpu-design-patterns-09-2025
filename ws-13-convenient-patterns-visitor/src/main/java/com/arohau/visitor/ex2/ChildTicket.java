package com.arohau.visitor.ex2;

public class ChildTicket  implements TicketElement {

    private int price;

    public ChildTicket(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
