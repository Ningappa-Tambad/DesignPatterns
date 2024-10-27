package ParkingLot.DTOS;

import ParkingLot.models.Gate;
import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;

public class IssueTicketRequestDto
{
    private Long gateId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;

    public Long getGateId() {
        return gateId;
    }

    public void setId(Long id) {
        this.gateId = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
