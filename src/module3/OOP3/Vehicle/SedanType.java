package module3.OOP3.Vehicle;

public class SedanType extends VehicleTypeByBody{


    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
