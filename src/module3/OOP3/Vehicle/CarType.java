package module3.OOP3.Vehicle;

public class CarType extends VehicleTypeByPurpose{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
