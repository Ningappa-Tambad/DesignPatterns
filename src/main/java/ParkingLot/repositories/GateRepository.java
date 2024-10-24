package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GateRepository
{
    //Implement inMemory --Create sample data for testing purpose

    private Map<Long,Gate> gateMap;
    private long id;

    public GateRepository()
    {
        gateMap = new HashMap<Long,Gate>();
        id=0L;
    }

    public Gate save(Gate gate)
    {
        //Update +insert >>>>Upsert operation

        if(gate.getId()==0)
        {
            //Insert
             gate.setId(++id);
             gateMap.put(id,gate);
             return gate;
        }
        gateMap.put(gate.getId(),gate);
        return gate;
    }

    public Optional<Gate> findById(long gateId)
    {
          if(gateMap.containsKey(gateId))
          {
              return Optional.of(gateMap.get(gateId));
          }
          return Optional.empty();
    }
}
