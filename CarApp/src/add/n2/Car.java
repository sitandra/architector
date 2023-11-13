package add.n2;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
    
}
