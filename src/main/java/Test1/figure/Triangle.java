package Test1.figure;

import static java.lang.Double.parseDouble;

public class Triangle implements IArea{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double area = sideA * sideB * sideC;
        area = parseDouble(Rounder.roundValue(area));
        return area;
    }
}
