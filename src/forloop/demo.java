package forloop;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int n = 0, sum = 0;

        // Step 1: Count the number of digits using a for loop
        for (int i = num; i> 0; i /= 10) {
            n++;
        }

        // Step 2: Calculate the sum of digits raised to the power n
        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            sum += Math.pow(digit, n);
        }

        // Step 3: Check if the sum equals the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }

}
