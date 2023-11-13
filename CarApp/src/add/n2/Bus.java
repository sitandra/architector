package add.n2;

public class Bus extends Vehicle{

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
    
}
