import mypackage.vehicles;

class Car extends vehicles
{
    String fuelType;

    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    public void displayCarInfo() 
    {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}
public class demo_package
{
    public static void main(String[] args) 
    {
        Car myCar = new Car("maruthi suzuki", "ertiga", 2016, "Petrol");
        myCar.displayCarInfo();
    }
}
