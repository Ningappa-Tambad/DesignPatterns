package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Map;
import java.util.Optional;

public class VehicleRepository
{
    private Map<Long, Vehicle> vehicleMap;
    //private Map<String, Vehicle> numberToVehicleMap;

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber)

    {
        return null;
    }


    public Optional<Vehicle> findById(long vehicleId)
    {
        return null;
    }

    public Vehicle Save(Vehicle vehicle)
    {
        return null;
    }
}
