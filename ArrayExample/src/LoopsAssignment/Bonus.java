package LoopsAssignment;

import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int experience = sc.nextInt();
		
		if(salary >= 30000 && experience >= 3)
			System.out.println("BONUS ELIGIBLE");
		else
			System.out.println("NOT ELIGIBLE");
		sc.close();
		

	}

}
