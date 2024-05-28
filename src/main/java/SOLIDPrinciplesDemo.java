import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public int numWheels = 0;
};

class VehicleWithEngines extends Vehicle {
    public int engineVersion;
}

class Car extends VehicleWithEngines {
    void setEngineVersion(int engineVersion) {
        this.engineVersion = engineVersion;
    }
}

class Bicycle extends Vehicle {
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public void setEngineVersion(int engineVersion) {
        try {
            throw new Exception("Bicycles do not have engines");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


public class SOLIDPrinciplesDemo {
    public static void main(String args[]) throws Exception {
        System.out.println("Adhering to the Liskov Substitution Principle");

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        VehicleWithEngines car = new Car();
        car.numWheels = 4;
        car.engineVersion = 1;
        vehicles.add(car);


        Vehicle bicycle = new Bicycle();
        bicycle.numWheels = 2;
        // bicycle.setEngineVersion(0); //Will Throw Error
        vehicles.add(bicycle);
    }
}
