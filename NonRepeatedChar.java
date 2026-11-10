//Q1. First Non-Repeated Character
//
//Write a Java program to find the first character that appears only once in a String.
//
//Input: swiss
//
//Expected Output: w


package FirstProgram;
import java.util.Scanner;

public class NonRepeatedChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		String input = sc.next();
		
		char[] arr = input.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j =0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				break;
			}
			
		}

	}

}
