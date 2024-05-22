package module3.OOP3.Vehicle;

public class TruckType extends VehicleTypeByPurpose{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
