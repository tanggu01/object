package org.eternity.theater.step01_copy.step01;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.hasInvitation()) {
            System.out.println("Enter with Invitation");
            Ticket ticket = ticketSeller.getTicket();
            audience.getTicket(ticket);
        } else {
            System.out.println("Enter w/o Invitation");
            Ticket ticket = ticketSeller.sellTicket();
            audience.buyTicket(ticket);
        }

//        if (audience.getBag().hasInvitation()) {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().setTicket(ticket);
//        } else {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
    }
}

