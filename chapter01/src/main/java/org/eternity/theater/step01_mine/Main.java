package org.eternity.theater.step01_mine;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1000L);
        Ticket ticket2 = new Ticket(1000L);
        Ticket ticket3 = new Ticket(1000L);

        TicketOffice ticketOffice = new TicketOffice(1000L, ticket1, ticket2, ticket3);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Audience audience1 = new Audience(new Bag(1000L));
        Audience audience2 = new Audience(new Bag(new Invitation(), 1000L));

        Theater theater = new Theater(ticketSeller);
        theater.enter(audience1);
        theater.enter(audience2);
    }
}
