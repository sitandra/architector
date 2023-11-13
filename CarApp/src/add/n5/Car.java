package add.n5;

public class Car {
    private final IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }
    
    public void start() {
        this.engine.start();
    }
}
