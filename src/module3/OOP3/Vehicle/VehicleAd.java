package module3.OOP3.Vehicle;

public class VehicleAd {
    String id;
    String model;
    VehicleTypeByPurpose vehicleTypeByPurpose;
    VehicleTypeByBody vehicleTypeByBody;
    VehicleByFuelTypes vehicleByFuelTypes;

    public VehicleAd(String model, String id, VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleTypeByBody vehicleTypeByBody, VehicleByFuelTypes vehicleByFuelTypes) {

        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBody = vehicleTypeByBody;
        this.vehicleByFuelTypes = vehicleByFuelTypes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public void setVehicleTypeByPurpose(VehicleTypeByPurpose vehicleTypeByPurpose) {
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
    }

    public VehicleTypeByBody getVehicleTypeByBody() {
        return vehicleTypeByBody;
    }

    public void setVehicleTypeByBody(VehicleTypeByBody vehicleTypeByBody) {
        this.vehicleTypeByBody = vehicleTypeByBody;
    }

    public VehicleByFuelTypes getVehicleByFuelTypes() {
        return vehicleByFuelTypes;
    }

    public void setVehicleByFuelTypes(VehicleByFuelTypes vehicleByFuelTypes) {
        this.vehicleByFuelTypes = vehicleByFuelTypes;
    }
}
