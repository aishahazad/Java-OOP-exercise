package com.cinema;

public class ChildTicket extends Ticket {
	@Override
    public long getPrice() {
        return 4L;
    }
}
