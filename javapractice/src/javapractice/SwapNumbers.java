package javapractice;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int num1,num2,temp;
		System.out.println("Enter num1 and num2:");
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Before Swapping\nnum1 = "+num1+ "\nnum2 = "+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping\nnum1 = "+num1+ "\nnum2 = "+num2);

	}

}
