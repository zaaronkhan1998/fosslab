package cts;

import java.util.Scanner;

public class BinaryAdd {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Input the first binary number: ");
		String n1 = sc.next();
		System.out.print("Input the second binary number: ");
		String n2 = sc.next();
		
		int sum = Integer.parseInt(n1 ,2) * Integer.parseInt(n2 ,2);
		System.out.println("Product of two binary numbers: " + Integer.toBinaryString(sum));

	}
}
