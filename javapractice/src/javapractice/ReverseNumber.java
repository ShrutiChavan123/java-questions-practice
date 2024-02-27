package javapractice;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int number) {
        int reversed = 0; // Step 1:Initialize the reversed number
        while (number != 0) { // Step 2: Loop until the number is not zero
            int digit = number % 10;          // Step 3: Extract the last digit
            reversed = reversed * 10 + digit; // Step 4: Append the digit to reversed
            number = number / 10;             // Step 5: Remove the last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        int originalNumber ;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        originalNumber = sc.nextInt();
        int reversedNumber = reverse(originalNumber);
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber); 
    }
}
