/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class CommandLineInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int invalid=0;
		
		for (int i = 0; i < args.length; i++) {
			try {
				sum = sum + Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				invalid +=1;
			}
		}
		System.out.println("Sum = " + sum);
		System.out.println("Invalid arguments = "+invalid);
		
	}

}
