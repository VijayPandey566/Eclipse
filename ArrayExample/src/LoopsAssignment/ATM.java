package LoopsAssignment;

import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if (withdraw % 100 != 0) {
            System.out.println("INVALID AMOUNT");
        } else if (balance >= withdraw) {
            System.out.println("WITHDRAWAL SUCCESSFUL");
        } else {
            System.out.println("INSUFFICIENT BALANCE");
            sc.close();
        }
    }
}
