package LoopsAssignment;

import java.util.*;

class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("ELIGIBLE");
        else
            System.out.println("NOT ELIGIBLE");
        sc.close();    }
}
