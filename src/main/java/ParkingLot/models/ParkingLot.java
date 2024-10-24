package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private List<ParkingFloor> parkingFloor;
    private List<Gate> gate;
    private List<VehicleType> supportedVehicleTypes;
    private FeeCalculationStretegyType feeCalculationStretegyType;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public FeeCalculationStretegyType getFeeCalculationStretegyType() {
        return feeCalculationStretegyType;
    }

    public void setFeeCalculationStretegyType(FeeCalculationStretegyType feeCalculationStretegyType) {
        this.feeCalculationStretegyType = feeCalculationStretegyType;
    }

    public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
        return spotAssignmentStrategyType;
    }

    public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
    }
}
