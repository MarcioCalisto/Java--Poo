package edu.marcio.atividades;

public class BubbleSortExample {
    public static void main(String[] args) {
        double[] array = { 1.8, 7, 9, 2, 3 };
        System.out.println("Array antes ....");
        for (double num : array) {
            System.out.print(num + " ");
        }
        bubbleSort(array);
        System.out.println("\n\nArray após ....");
        for (double num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(double[] array) {
        int n = array.length;
        boolean vTrocou;
        for (int i = 0; i < n - 1; i++) {
            vTrocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    vTrocou = true;
                }
            }
            if (!vTrocou)
                break;
        }
    }
}
