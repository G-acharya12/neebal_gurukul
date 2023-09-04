package day_1_assignment;

import java.util.Scanner;

public class Swap {
	public static void main (String[]args) {
		Scanner sc= new Scanner (System.in);
		int Digit=sc.nextInt();
		int t=Digit%100;
		Digit=Digit/100;
		System.out.println("output"+t+Digit);
	}
}
