package LoopsAssignment;

import java.util.*;

class Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();

        if (balance >= 1000)
            System.out.println("BALANCE OK");
        else
            System.out.println("LOW BALANCE");
        sc.close();
    }
}
