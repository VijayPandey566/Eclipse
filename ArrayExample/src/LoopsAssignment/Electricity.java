package LoopsAssignment;

import java.util.*;

public class Electricity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		
		if (units <= 100)
			System.out.println("LOW USAGE");
		else if (units <= 300)
			System.out.println("MEDIUM USAGE");
		else
			System.out.println("HIGH USAGE");
		sc.close();
		

	}

}
