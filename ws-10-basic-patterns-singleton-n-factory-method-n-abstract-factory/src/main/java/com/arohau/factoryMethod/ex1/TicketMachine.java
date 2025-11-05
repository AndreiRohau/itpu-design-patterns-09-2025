package com.arohau.factoryMethod.ex1;

import java.util.Map;
import java.util.function.Supplier;

// Factory method design pattern: Factory for tickets
public class TicketMachine {
    private static final Map<String, Supplier<Ticket>> ticketMap = Map.of(
            "bus", BusTicket::new,
            "train", TrainTicket::new,
            "plane", PlaneTicket::new
    );

    public static Ticket createTicket(String type) {
        Supplier<Ticket> ticketSupplier = ticketMap.get(type);
        if (ticketSupplier != null) {
            return ticketSupplier.get();
        } else {
            throw new IllegalArgumentException("Invalid ticket type.");
        }
    }
}
