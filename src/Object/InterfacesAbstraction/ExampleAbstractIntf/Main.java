package Object.InterfacesAbstraction.ExampleAbstractIntf;

public class Main {
    public static void main(String[] args) {
//        CustomCar car=new CustomCar();
//        car.brake();
//        car.accelerate();
        //so now by using the interfaces we can achieve the multilevel inheritance
        //interface does not care that the two classes are related to each other but they can still inherited


        // Create ElectricCar and GasCar instances
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        // Create a HybridCar instance and set the initial engine
        HybridCar hybridCar = new HybridCar(electricCar);
        hybridCar.startEngine(); // Starts the electric engine

        // Switch to the gas engine
        hybridCar.setEngine(gasCar);
        hybridCar.startEngine(); // Starts the gasoline engine

    }
}
