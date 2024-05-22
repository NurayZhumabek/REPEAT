package module3.OOP3.Vehicle;

public class VehicleByFuelTypes extends VehicleType{
    public VehicleByFuelTypes( ) {
        super("Vehicle type by fuel");

    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || getClass()!=obj.getClass()) return false;
        VehicleByFuelTypes that=(VehicleByFuelTypes) obj;
        return attribute!=null ? attribute.equals(that.attribute):false;
    }
}
