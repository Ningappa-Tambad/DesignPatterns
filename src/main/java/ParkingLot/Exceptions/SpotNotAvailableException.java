package ParkingLot.Exceptions;

public class SpotNotAvailableException extends Exception{
    public SpotNotAvailableException(String message){
        super(message);
    }
}
