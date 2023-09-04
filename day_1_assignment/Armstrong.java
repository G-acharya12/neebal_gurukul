package day_1_assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		int b= (a%10);
		int c= (b%100)/10;
		int d= (c%100);
		
		int x=(int)Math.pow(b, 3);
		int y=(int)Math.pow(c, 3);
		int z=(int)Math.pow(d, 3);
		
		int r =(x+y+z);
		if (a==r)
			System.out.println(a+"is a Armstrong Number");
		else
			System.out.println(a+"is not a Armstrong Number");
		sc.close();
		
	}

}
