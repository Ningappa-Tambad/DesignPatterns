package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {


    private Map<Long, Ticket> ticketMap;

    private Long id;

    public TicketRepository() {
        ticketMap = new HashMap<Long, Ticket>();
        id=0L;
    }


    public Ticket save(Ticket ticket)
    {
        ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }
}
