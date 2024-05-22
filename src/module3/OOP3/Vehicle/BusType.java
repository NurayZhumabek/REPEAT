package module3.OOP3.Vehicle;

public class BusType  extends VehicleTypeByBody{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
