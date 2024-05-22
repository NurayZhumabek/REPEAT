package module3.OOP3.Vehicle;

public class Main {
    public static void main(String[] args) {
        AdsService adsService=new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new Passenger(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd porshe = new VehicleAd("Porshe","777",new CarType(),new SedanType(),new ElectricType());
        VehicleAd bus=new VehicleAd("Bus","1212",new Passenger(),new BusType(),new DieselType());

        adsService.setAdList(new VehicleAd[]{volvoAd,kamazAd,porshe,bus});

        adsService.filterByVehicleTypeByBody(new SedanType());
        adsService.filterByVehicleTypeByPurpose(new Passenger());
        adsService.filterByVehicleTypeByFuel(new ElectricType());
    }

}
