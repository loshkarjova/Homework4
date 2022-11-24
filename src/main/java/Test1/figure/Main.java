package Test1.figure;

public class Main {

    public static void main(String[] args) {
        IArea circle = new Circle(10);
        //area = 314,16

        IArea triangle = new Triangle(5, 3, 2);
        //area = 30

        IArea square = new Square(5);
        //area = 25


        IArea[] figures = new IArea[]{circle, triangle, square};
        double[] totalArea = new double[figures.length];
        for (int i = 0; i < figures.length; i++) {
            double calculateArea = figures[i].calculateArea();
            totalArea[i] = calculateArea;
        }
        double totalSum = 0;
        for (double v : totalArea) {
            totalSum += v;
        }

        System.out.println("Total area = " + totalSum);
    }


}
