package Test1.figure;

import static java.lang.Double.parseDouble;

public class Square implements IArea{
    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(sideA, 2);
        area = parseDouble(Rounder.roundValue(area));
        return area;
    }
}
