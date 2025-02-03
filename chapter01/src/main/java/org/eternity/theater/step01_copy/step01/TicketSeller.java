package org.eternity.theater.step01_copy.step01;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public Ticket getTicket() {
        return ticketOffice.getTicket();
    }

    public Ticket sellTicket() {
        Ticket ticket = ticketOffice.getTicket();
        ticketOffice.minusAmount(ticket.getFee());
        return ticket;

    }
}
