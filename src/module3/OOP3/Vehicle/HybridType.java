package module3.OOP3.Vehicle;

public class HybridType extends VehicleByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }

}
