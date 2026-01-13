package LoopsAssignment;

import java.util.Scanner;

class EmployeeRating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 75) {
            System.out.println("EXCELLENT");
        } else if (score >= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("NEED IMPROVEMENT");
            sc.close();
        }
    }
}
