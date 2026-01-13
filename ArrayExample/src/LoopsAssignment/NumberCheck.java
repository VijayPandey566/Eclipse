package LoopsAssignment;

import java.util.*;

public class NumberCheck {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println("POSTIVE");
		else if (num>0)
			System.out.println("NEGATIVE");
		else 
			System.out.println("ZERO");
		sc.close();
		
	}

}
