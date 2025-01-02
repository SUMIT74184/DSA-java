package Object.InterfacesAbstraction.ExampleAbstractIntf;

// Define the Engine interface
public interface Engine1 {
    void startEngine();
}

// Implement ElectricCar
class ElectricCar implements Engine1 {
    @Override
    public void startEngine() {
        System.out.println("Starting the electric engine...");
    }
}

// Implement GasCar
class GasCar implements Engine1 {
    @Override
    public void startEngine() {
        System.out.println("Starting the gasoline engine...");
    }
}

// Implement HybridCar with clear selection
class HybridCar implements Engine1 {
    private Engine1 selectedEngine;

    // Constructor to set the default engine
    public HybridCar(Engine1 engine) {
        this.selectedEngine = engine;
    }

    // Method to set the desired engine dynamically
    public void setEngine(Engine1 engine) {
        this.selectedEngine = engine;
    }


    @Override
    public void startEngine() {

    }
}

// Main class to test the code



