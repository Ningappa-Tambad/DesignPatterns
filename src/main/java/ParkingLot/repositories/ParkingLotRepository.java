package ParkingLot.repositories;

import ParkingLot.models.ParkingLot;

import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository
{
    private Map<Long, ParkingLot> parkingLots;


    public Optional<ParkingLot> findByGateId(Long gateId)
    {
        return null;
    }


}
