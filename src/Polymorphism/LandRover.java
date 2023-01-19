package Polymorphism;

public class LandRover extends Car{

    public LandRover(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Land Rover, " + this.getName() + " has started.";
    }

    @Override
    public String accelerate() {
        return "Land Rover, " + this.getName() + "  is accelerating.";
    }

    @Override
    public String brake() {
        return "Land Rover, " + this.getName() + " is braking.";
    }
}
