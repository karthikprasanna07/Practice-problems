package Sem7;

import java.util.Scanner;
public class Variableknapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get number of items from user
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();//2
        // Arrays to store weights, values, and ratio
        double[] weight = new double[n];
        double[] value = new double[n];
        double[] ratio = new double[n];
        // Get weights and values from user
        System.out.println("Enter weight and value for each item:");
        for (int i = 0; i < n; i++) {//1<2
            System.out.print("Item " + (i + 1) + " - Weight: ");
            weight[i] = scanner.nextDouble();
            System.out.print("Item " + (i + 1) + " - Value: ");
            value[i] = scanner.nextDouble();
            ratio[i] = value[i] / weight[i];
        }
        // Get knapsack capacity
        System.out.print("Enter knapsack capacity: ");
        double capacity = scanner.nextDouble();//2

        // Sort items based on ratio (value/weight) in descending order using simple bubble sort
        for (int i=0; i < n - 1; i++) {//1<1
            for (int j = 0; j < n - i - 1; j++) {//1<1
                if (ratio[j] < ratio[j + 1]) {//500<250
                    // Swap ratio
                    double tempRatio = ratio[j];
                    ratio[j] = ratio[j + 1];
                    ratio[j + 1] = tempRatio;
                    // Swap weight
                    double tempWeight = weight[j];
                    weight[j] = weight[j + 1];
                    weight[j + 1] = tempWeight;
                    // Swap value
                    double tempValue = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = tempValue;

                }
            }
        }
        // Calculate maximum value
    }
}