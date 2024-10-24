package ParkingLot.strategies.spotAssignmentStrategy;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingSpot;
import ParkingLot.models.VehicleType;

public interface SpotAssignmentStrategy
{
    ParkingSpot spotAssignment(VehicleType vehicleType, Gate gate);
}
