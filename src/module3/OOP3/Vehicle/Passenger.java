package module3.OOP3.Vehicle;

public class Passenger extends VehicleTypeByPurpose{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
