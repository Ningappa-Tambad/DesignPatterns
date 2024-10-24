package ParkingLot.services;

import ParkingLot.Exceptions.GateNotFoundException;
import ParkingLot.models.Gate;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService
{

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository)
    {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) throws GateNotFoundException

    {

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

       return null;

    }


}
