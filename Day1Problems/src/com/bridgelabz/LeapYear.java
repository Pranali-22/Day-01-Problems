/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		
		if(year>=1582) {
			if((year%4==0) && (year%100!=0) || (year%400==0)) {
				System.out.println(year + " is a leap year");
			}
			else
				System.out.println(year + " is not a leap year");
		}
		else
			System.out.println("Year should be greater than or equal to 1582");

	}

}
