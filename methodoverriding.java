class Vehicle
 {
    void fuel() 
    {
        System.out.println("petrol or diesel");
    }
}

class Car extends Vehicle
 {
    // overriding fuel()
    void fuel()
     {
        System.out.println("petrol is the most used fuel for cars");
    }
}

class Truck extends Vehicle
 {
    // overriding fuel()
    void fuel() 
    {
        System.out.println("diesel is the most used fuel for trucks");
    }
}

public class methodoverriding
 {
    public static void main(String[] args)
     {
        // Object of type Vehicle
        Vehicle v = new Vehicle();
        // Object of type Car
        Car car = new Car();
        // Object of type Truck
        Truck truck = new Truck();

        // Reference of type Vehicle
        Vehicle ref;

        // ref refers to Vehicle object
        ref = v;
        ref.fuel(); 

        // ref refers to Car object
        ref = car;
        ref.fuel(); 

        // ref refers to Truck object
        ref = truck;
        ref.fuel(); 
    }
}
