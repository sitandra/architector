package add.n4;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
    
}
