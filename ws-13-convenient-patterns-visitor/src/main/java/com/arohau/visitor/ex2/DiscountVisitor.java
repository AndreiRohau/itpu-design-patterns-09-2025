package com.arohau.visitor.ex2;

public class DiscountVisitor implements Visitor {

    private final int percentOfAdultDiscount = 10;
    private final int percentOfChildDiscount = 50;

    @Override
    public void visit(AdultTicket ticket) {
        ticket.setPrice(applyDiscount(ticket.getPrice(), percentOfAdultDiscount));
    }

    @Override
    public void visit(ChildTicket ticket) {
        ticket.setPrice(applyDiscount(ticket.getPrice(), percentOfChildDiscount));
    }

    private int applyDiscount(int price, int percentOfDiscount) {
        return price * (100 - percentOfDiscount) / 100;
    }

    @Override
    public void visit(GroupTicket ticket) {
        ticket.getElements().forEach(element -> element.accept(this));
    }
}
