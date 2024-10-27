package ParkingLot.factories;

import ParkingLot.models.SpotAssignmentStrategyType;
import ParkingLot.strategies.spotAssignmentStrategy.CheapestSpotAssignmentStrategy;
import ParkingLot.strategies.spotAssignmentStrategy.RandomSpotAssignmentStrategy;
import ParkingLot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

public class spotAssignmentStrategyFactory
{
    public static SpotAssignmentStrategy getSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentstrategyType)
    {
        if(spotAssignmentstrategyType.equals(SpotAssignmentStrategyType.CHEAPEST))
        {
            return new CheapestSpotAssignmentStrategy();
        }
        else if (spotAssignmentstrategyType.equals(SpotAssignmentStrategyType.RANDOM)) {
            return new RandomSpotAssignmentStrategy();

        }
        else
        {
            return null;
        }
    }
}
