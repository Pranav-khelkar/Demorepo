import java.util.Scanner;

public class SumOfLargestAndSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();


        int[] numbers = new int[n];

    
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

     
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

   
        int sum = largest + smallest;

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The sum of the largest and smallest number is: " + sum);

        scanner.close();
    }
}
