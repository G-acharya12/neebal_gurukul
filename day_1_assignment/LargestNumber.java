package day_1_assignment;
import java.util.Scanner;
public class LargestNumber 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
			int x,y,z;
         System.out.println("Enter the first number");
         x=sc.nextInt();
         System.out.println("Enter the second number");
         y=sc.nextInt();
         System.out.println("Enter the third number");
         z=sc.nextInt();
         if (x>y && x>z) {
        	 System.out.println("Largest number is:"+x);
         }
         else if (y>z) {
        	 System.out.println("Largest number is:"+y);
         }
         else {
        	 System.out.println("Largest number is:"+z);
         }
	
   }
}
