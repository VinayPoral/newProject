package sample;

import java.util.Scanner;

// added new comment by vinay -1
// added new comment again for branching
// added commit for merging
// i wanted see change after merge
// hello
public class animal {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your Palindrom :");
		String input = scan.next();
		
		String temp = " ";
		for(int i=0;i<input.length();i++) {
			temp = input.charAt(i)+ temp;
			
		}
		
		if(temp.equalsIgnoreCase(temp)) {
			System.out.println("The given String is palindrom");
		}else {
			System.out.println("The given String is not palindrom");
		}
	}
	}