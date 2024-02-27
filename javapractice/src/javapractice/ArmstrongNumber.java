package javapractice;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        // Step 1: Find number of digits (n)
        int n = String.valueOf(num).length();

        // Step 2: For each digit, raise it to the power n and accumulate the sum
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        // Step 3: Compare the sum with the original number
        return sum == original;
    }
}