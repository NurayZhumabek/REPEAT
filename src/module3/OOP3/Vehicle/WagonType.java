package module3.OOP3.Vehicle;

public class WagonType extends VehicleTypeByBody {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
