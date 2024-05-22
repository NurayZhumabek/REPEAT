package module3.OOP3.Vehicle;

public class VehicleTypeByPurpose extends  VehicleType{
    public VehicleTypeByPurpose() {
        super("Vehilce type by Purpose");
    }

    @Override
    public boolean equals(Object obj) {

        if (obj== null || getClass()!=obj.getClass()) return false;

        VehicleTypeByPurpose that=(VehicleTypeByPurpose) obj;
        return attribute!=null ?attribute.equals(that.attribute):false;
    }

}
