package praktikum.sesi8.Vehicle;

class Vehicle{
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Brand: "+ brand);
    }
}

class Car extends Vehicle{
    int doors;

    public Car(String brand, int doors){
        super(brand);
        this.doors = doors;
    }

    public void displayInfo(String type){
        super.displayInfo();
        System.out.println("Typer: "+ type + ", Doors: " + doors);
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.displayInfo("Sedan");
    }
}
