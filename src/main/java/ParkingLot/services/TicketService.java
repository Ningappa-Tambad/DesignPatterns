package ParkingLot.services;

import ParkingLot.Exceptions.GateNotFoundException;
import ParkingLot.Exceptions.SpotNotAvailableException;
import ParkingLot.factories.spotAssignmentStrategyFactory;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService
{

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    SpotAssignmentStrategy spotAssignmentStrategy;
    ParkingLotRepository parkingLotRepository;
    TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
                         SpotAssignmentStrategy spotAssignmentStrategy,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository)
    {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public TicketService(GateRepository gateRepository, TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, VehicleRepository vehicleRepository) {
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String ownerName, VehicleType vehicleType) throws GateNotFoundException, SpotNotAvailableException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
       Optional<Gate> optionalGate= gateRepository.findById(gateId);




       if(optionalGate.isEmpty())
       {
           throw new GateNotFoundException("Gate with id: " + gateId + "Not found");
       }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
      Optional<Vehicle> optionalVehicle= vehicleRepository.findByVehicleNumber(vehicleNumber);


       Vehicle savedVehicle = null;
       if(optionalVehicle.isEmpty())
       {
           //Create a new vehilceand save it in the data base

         Vehicle vehicle=new Vehicle();
         vehicle.setVehicleNumber(vehicleNumber);
         vehicle.setVehicleType(vehicleType);
         vehicle.setOwnername(ownerName);
        savedVehicle=vehicleRepository.Save(vehicle);

       }
       else
       {
           savedVehicle=optionalVehicle.get();
       }



       ticket.setVehicle(savedVehicle);

       ticket.setNumber("Ticket number");

       Optional<ParkingLot> optionalParkingLot=parkingLotRepository.findByGateId(gateId);

       if(optionalParkingLot.isEmpty())
       {
           throw new RuntimeException("Invalid parking lot/Gate id: " + gateId);
       }
       ParkingLot parkingLot = optionalParkingLot.get();


       SpotAssignmentStrategy spotAssignmentStrategy1= spotAssignmentStrategyFactory.
               getSpotAssignmentStrategyType(parkingLot.getSpotAssignmentStrategyType());



       ParkingSpot parkingSpot=spotAssignmentStrategy.spotAssignment(vehicleType,gate);

      if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.NOT_AVAILABLE))
        {
            throw new SpotNotAvailableException("Spot not available");
        }

      //Assign spot to ticket

        ticket.setParkingSpot(parkingSpot);

       return ticketRepository.save(ticket);

    }


}
