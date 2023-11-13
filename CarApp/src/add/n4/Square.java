package add.n4;

public class Square extends Shape{
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
    
}
