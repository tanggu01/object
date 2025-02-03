package org.eternity.theater.refactor;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
//        Ticket ticket = ticketOffice.getTicket();
//        Long paidAmount = audience.buy(ticket);
//        ticketOffice.plusAmount(paidAmount);
    }

}
