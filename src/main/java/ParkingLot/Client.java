package ParkingLot;

import ParkingLot.DTOS.IssueTicketRequestDto;
import ParkingLot.DTOS.IssueTicketResponseDto;
import ParkingLot.controllers.TicketController;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class Client
{
    public static void main(String[] args) {

        GateRepository  gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService=new TicketService(gateRepository,
                ticketRepository,parkingLotRepository,vehicleRepository);

        TicketController ticketController=new TicketController(ticketService);


        IssueTicketRequestDto issueTicketRequestDto=new IssueTicketRequestDto();

        issueTicketRequestDto.setId(1234L);
        issueTicketRequestDto.setOwnerName("Avyaan");
        issueTicketRequestDto.setVehicleNumber("KA05NB5213");
        issueTicketRequestDto.setVehicleType(VehicleType.LARGE);


        IssueTicketResponseDto responseDto =ticketController.issueTicket(issueTicketRequestDto);
    }
}
