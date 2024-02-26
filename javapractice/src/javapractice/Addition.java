package javapractice;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		
		System.out.println("Enter num2:");
		num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Addition is:"+sum);

	}

}
