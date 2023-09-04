package day_1_assignment;
import java.util.Scanner;
public class Days 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		int milisecond=sc.nextInt();
		int h=milisecond/3600000;
		milisecond=milisecond-3600000*h;
		int mint=milisecond/60000;
		milisecond=milisecond-60000*mint;
		int sec=milisecond/1000;
		System.out.println("time"+h+mint+sec);
}
