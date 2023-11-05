package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class Poligon {
    public List<Point3D> Points;

    public Poligon() {
        this.Points = new ArrayList<>();
    }

    public Poligon(Point3D point1, Point3D point2, Point3D point3, Point3D... points) {
        this();
        this.Points.add(point1);
        this.Points.add(point2);
        this.Points.add(point3);
        if (points.length > 0) {
            for (Point3D point: points) {
                this.Points.add(point);
            }
        }
    }
}
