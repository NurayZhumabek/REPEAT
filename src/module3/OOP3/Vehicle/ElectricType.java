package module3.OOP3.Vehicle;

public class ElectricType extends VehicleByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
