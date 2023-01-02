import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int length = scanner.nextInt();
        int[] arr = new int[length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.print("The average of the elements in the array: " + sum / arr.length);
    }
}
