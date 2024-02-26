package javapractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,c,fact=1;
		
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Number is negative.Please enter non negative number.");
		}
		else {
			for(c =1;c<=num;c++) {
				fact = fact *c;
			}
				System.out.println("Factorial of "+num+" is = "+fact);
		}
	}

}
