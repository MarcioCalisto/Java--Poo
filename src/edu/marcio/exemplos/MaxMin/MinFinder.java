import java.util.Scanner;

public class MinFinder {

    public void determineMin() {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com 3 valores: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double resultado = maximum(num1, num2, num3);

        System.out.println("Minimum " + resultado);
}
    public double maximum(double x, double y, double z) {

        double minValue = x;

        if (y < minValue)
        minValue = y;

        if (z < minValue) 
        minValue = z;

        return minValue;
    }
}

