package module3.OOP3.Vehicle;

public class VehicleTypeByBody extends VehicleType{
    public VehicleTypeByBody( ) {
        super("Vehicle type by body");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null|| getClass()!=obj.getClass()) return false;
        VehicleTypeByBody that=(VehicleTypeByBody) obj;
        return attribute!=null?attribute.equals(that.attribute):false;
    }
}
