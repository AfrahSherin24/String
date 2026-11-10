//
//Q2. Remove Duplicate Characters
//
//Write a Java program to remove duplicate characters while maintaining the original order.
//
//Input: programming
//
//Expected Output: progamin

package FirstProgram;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		String input = sc.nextLine();
		
		String result = "";
		
		
		for(int i=0; i<input.length(); i++) {
			boolean duplicate = false;
	
			for(int j=0; j<result.length(); j++) {
		
				if(input.charAt(i) == result.charAt(j)) {
					duplicate = true;
					break;
	}
	}
			if(duplicate==false) {
				result = result + input.charAt(i);
			}
}
		System.out.println(result);
		}
		

	}


