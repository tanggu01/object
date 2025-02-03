package org.eternity.theater.step01_mine;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public boolean hasInvitation() {
        return bag.hasInvitation();
    }

    public void getTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }

    public void buyTicket(Ticket ticket) {
        bag.minusAmount(ticket.getFee());
        bag.setTicket(ticket);
    }
}
