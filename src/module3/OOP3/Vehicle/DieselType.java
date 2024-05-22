package module3.OOP3.Vehicle;

public class DieselType extends VehicleByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
