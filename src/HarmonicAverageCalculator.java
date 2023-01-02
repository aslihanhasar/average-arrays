import java.util.Scanner;

public class HarmonicAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int length = scanner.nextInt();
        int[] arr = new int[length];
        double harmonicAverage, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            arr[i] = scanner.nextInt();
            sum += 1.0 / arr[i];
        }
        harmonicAverage = arr.length / sum;
        System.out.print("The Harmonic Average of the elements in the array: " + harmonicAverage);
    }
}

