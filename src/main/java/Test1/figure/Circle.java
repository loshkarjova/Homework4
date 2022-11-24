package Test1.figure;

import static java.lang.Double.parseDouble;

public class Circle implements IArea {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        area = parseDouble(Rounder.roundValue(area));
        return area;
    }
}
