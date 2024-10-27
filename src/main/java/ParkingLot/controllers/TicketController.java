package ParkingLot.controllers;

import ParkingLot.DTOS.IssueTicketRequestDto;
import ParkingLot.DTOS.IssueTicketResponseDto;
import ParkingLot.DTOS.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController
{

private TicketService ticketService;

public TicketController(TicketService ticketService)
{
    this.ticketService = ticketService;
}
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto)
    {
      IssueTicketResponseDto  responseDto = null;

        try
        {
             Ticket ticket=ticketService.issueTicket(requestDto.getGateId(),
                     requestDto.getVehicleNumber(),requestDto.getOwnerName(),
                     requestDto.getVehicleType());

           responseDto.setTicket(ticket);
           responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch(Exception e)
        {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }


}
