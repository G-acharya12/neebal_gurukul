package day_1_assignment;

import java.util.*;

public class Yearsmonth {

	public static void main(String[] args) {		Scanner sc= new Scanner (System.in);
		int Days=1020;
		int years= Days/365;
		Days-=(365*2);
		int months=Days/30;
		Days-= 30*months;
		int weeks=Days/7;
		 Days-=7*weeks;
		
		System.out.println("Year:Months:Weeks:Days"+years+" "+months+" "+weeks+" "+Days);
		
	
	
	}

}
