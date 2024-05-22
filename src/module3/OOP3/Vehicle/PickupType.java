package module3.OOP3.Vehicle;

public class PickupType extends VehicleTypeByBody{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
