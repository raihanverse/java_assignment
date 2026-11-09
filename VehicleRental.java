abstract class Vehicle{
  private int vehicleid;
  private String vehicleName;
  private float rentalRate;
  Vehicle(int vehicleid,String vehicleName, float rentalRate){
    this.vehicleid= vehicleid;
    this.vehicleName= vehicleName;
    this.rentalRate= rentalRate;
  }
  int getvehicleid(){
    return vehicleid;
  }
  String getvehiclename(){
    return vehicleName;
  }
  float getrentalrate(){
    return rentalRate;
  }
  abstract float calculateRentalCost(int days);
  void displayVehicleDetails(){
    System.out.println("vehicleid: "+ vehicleid);
    System.out.println("vehicleName: "+ vehicleName);
    System.out.println("rentalRate: "+ rentalRate);
  }
}
class Car extends Vehicle{
  Car(int vehicleid,String vehicleName, float rentalRate){
    super(vehicleid, vehicleName, rentalRate);
  }
  @Override
  float calculateRentalCost(int days){
    return getrentalrate() * days + 500;
  }
}
class Bike extends Vehicle{
  Bike(int vehicleid,String vehicleName, float rentalRate){
    super(vehicleid, vehicleName, rentalRate);
  }
  @Override
  float calculateRentalCost(int days){
    return getrentalrate() * days + 100;
  }
}
public class VehicleRental{
  public static void main(String[] args) {
    Car c1 = new Car(1, "Toyota Axio", 3000);
    Car c2 = new Car(2, "Honda Civic", 4000);
    Bike b1 = new Bike(3, "Yamaha R15", 800);
    Bike b2 = new Bike(4, "Suzuki Gixxer", 600);

    c1.displayVehicleDetails();
    System.out.println("days: 3");
    System.out.println("final rental cost: "+ c1.calculateRentalCost(3));

    c2.displayVehicleDetails();
    System.out.println("days: 5");
    System.out.println("final rental cost: "+ c2.calculateRentalCost(5));

    b1.displayVehicleDetails();
    System.out.println("days: 4");
    System.out.println("final rental cost: "+ b1.calculateRentalCost(4));

    b2.displayVehicleDetails();
    System.out.println("days: 2");
    System.out.println("final rental cost: "+ b2.calculateRentalCost(2));
  }
}