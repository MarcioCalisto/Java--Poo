import java.util.Scanner;

public class MaxFinder {

    public void determineMax() {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com 3 valores: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double resultado = maximum(num1, num2, num3);

        System.out.println("Maximum " + resultado);
}
    public double minimun (double x, double y, double z) {

        double minimunValue = x;

        if (y < minimunValue)
            minimunValue = y;

        if (z < minimunValue) 
            minimunValue = z;

        return minimunValue;
    }

    public double maximum (double x, double y, double z) {

        double maximumValue = x;

        if (y > maximumValue)
            maximumValue = y;

        if (z > maximumValue) 
            maximumValue = z;

        return maximumValue;
    }

}
