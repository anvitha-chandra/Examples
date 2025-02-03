package day2;

public class Main {
    public static void testDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        
       testDrive(car);       
       testDrive(motorcycle); 
    }
}

