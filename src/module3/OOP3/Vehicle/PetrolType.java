package module3.OOP3.Vehicle;

public class PetrolType extends VehicleByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
