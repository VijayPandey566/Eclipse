package LoopsAssignment;

import java.util.Scanner;

class LoginValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int correctPassword = 1234;
        int password;
        boolean success = false;

        for (int i = 1; i <= 3; i++) {
            password = sc.nextInt();

            if (password == correctPassword) {
                success = true;
                break;
            }
            sc.close();
        }

        if (success) {
            System.out.println("LOGIN SUCCESSFUL");
        } else {
            System.out.println("ACCOUNT LOCKED");
        }
    }
}
