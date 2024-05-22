package module3.OOP3.Vehicle;

public class AdsService {
    VehicleAd [] adsList;
    public void setAdList(VehicleAd[] adsList) {
        this.adsList = adsList;
    }
    void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleTypeByPurpose){
        for (VehicleAd i:adsList){
            if (i.getVehicleTypeByPurpose().equals(vehicleTypeByPurpose)){
                System.out.println("Объявление № " + i.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleTypeByPurpose.getTypeName() + ", атрибут фильтра " + vehicleTypeByPurpose.getAttribute());
            } else {
                System.out.println("Объявление № " + i.getId() + " не прошло фильтр: тип авто - " + vehicleTypeByPurpose.getTypeName() + ", критерий- " +
                        vehicleTypeByPurpose.getAttribute() + ", так как имеет тип авто " +
                        i.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    void filterByVehicleTypeByBody(VehicleTypeByBody vehicleTypeByBody){
        for (VehicleAd i:adsList){

            if (i.getVehicleTypeByBody().equals(vehicleTypeByBody)){
                System.out.println("Объявление № " + i.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleTypeByBody.getTypeName() + ", атрибут фильтра " + vehicleTypeByBody.getAttribute());
            } else {
                System.out.println("Объявление № " + i.getId() + " не прошло фильтр: тип авто - " + vehicleTypeByBody.getTypeName() + ", критерий- " +
                        vehicleTypeByBody.getAttribute() + ", так как имеет тип авто " +
                        i.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }
    void filterByVehicleTypeByFuel(VehicleByFuelTypes vehicleByFuelTypes){
        for (VehicleAd i:adsList){

            if (i.getVehicleByFuelTypes().equals(vehicleByFuelTypes)){
                System.out.println("Объявление № " + i.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleByFuelTypes.getTypeName() + ", атрибут фильтра " + vehicleByFuelTypes.getAttribute());
            } else {
                System.out.println("Объявление № " + i.getId() + " не прошло фильтр: тип авто - " + vehicleByFuelTypes.getTypeName() + ", критерий- " +
                        vehicleByFuelTypes.getAttribute() + ", так как имеет тип авто " +
                        i.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    }



