package Object.InterfacesAbstraction.ExampleAbstractIntf;

public class CustomCar implements Engine,Brake{

    @Override
    public void brake() {
        System.out.println("Stopping the car from racing");
    }

    @Override
    public void start() {
        System.out.println("Starting like the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping like the car");
    }

    @Override
    public void accelerate() {
        System.out.println("racing the car");
    }
}
